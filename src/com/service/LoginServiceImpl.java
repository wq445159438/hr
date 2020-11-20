package com.service;

import com.entity.Users;
import com.mapper.LoginMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "loginService")
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper loginMapper;

    @Override
    public Users login(Users user) {
        return loginMapper.login(user);
    }
}
