package com.seeyoo.service.impl;

import com.seeyoo.mapper.UserMapper;
import com.seeyoo.model.User;
import com.seeyoo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by user on 2018/10/12.
 */
@Service("userService")
public class UserServiceImpl extends BaseService<User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User selectByAccount(String account) {
        return userMapper.selectByAccount(account);
    }
}
