package cn.com.mtong.interests.service.impl;

import cn.com.mtong.interests.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello() {
        return "hello mtong";
    }
};

