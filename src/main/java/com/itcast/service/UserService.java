package com.itcast.service;

import com.itcast.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Created by ljfeng on 2017/7/24.
 */
public interface UserService {
    public User getUserById(int userId);
    public int deleteUserById(int userId);
    public int insert(User user);
    public int updateUser(User user);
}
