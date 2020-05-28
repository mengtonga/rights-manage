package cn.com.mtong.interests.controller;

import cn.com.mtong.interests.controller.dto.ResponseDto;
import cn.com.mtong.interests.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rights/")
public class UserDetailController {
    @Autowired
    // 创建私有属性
    private UserDetailService UserDetailService;

    /**
     * 请求路径GetappingM，给前端调用的地址
     * @return
     */
    @GetMapping("getUserDetail")
    public ResponseDto<Object> getUserDetail(
            @RequestParam Integer userId,
            @RequestParam String UserName
    ) {
        Object result = UserDetailService.getUserDetail(UserName);
        return ResponseDto.doSuccess(result);
    }
}

