package cn.com.mtong.interests.service.impl;

import cn.com.mtong.interests.service.UserDetailService;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailService {
    @Override
    public String getUserDetail(String userName) {
        return userName;
    }
};