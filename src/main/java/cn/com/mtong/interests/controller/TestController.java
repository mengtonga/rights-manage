package cn.com.mtong.interests.controller;

import cn.com.mtong.interests.controller.dto.ResponseDto;
import cn.com.mtong.interests.service.TestService;
import cn.com.mtong.interests.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * controller，提供接口给前端，在controller包中自己定义一个，这个controller是测试的。
 *
 * @author mtong
 * @version: 1.0
 */
@RestController
@RequestMapping("/rights/")
public class TestController {

    @Autowired
    private TestService testService;
    private UserDetailService UserDetailService;

    @GetMapping("sayHello")
    public ResponseDto<String> sayHello() {
        String result = testService.sayHello();
        return ResponseDto.doSuccess(result);
    };


}
