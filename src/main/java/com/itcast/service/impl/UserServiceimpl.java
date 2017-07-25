package com.itcast.service.impl;

import com.itcast.dao.UserDao;
import com.itcast.pojo.User;
import com.itcast.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ljfeng on 2017/7/24.
 */
@Service
public class UserServiceimpl implements UserService{
    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(int userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public int deleteUserById(int userId) {
        return userDao.deleteUserById(userId);
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user) ;
    }
}
