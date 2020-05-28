package cn.com.mtong.interests.dao.mapper;

import cn.com.mtong.interests.dao.criteriaobj.User;

import java.util.List;

public interface UserDetail {
    /**
     * 获取待办对象（已去重）
     *
     * @param User
     * @return
     */
    List<String> getName(User User);
}
