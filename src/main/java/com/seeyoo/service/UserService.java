package com.seeyoo.service;

import com.seeyoo.model.User;

/**
 * Created by user on 2018/10/12.
 */
public interface UserService extends IService<User> {
    User selectByAccount(String account);
}
