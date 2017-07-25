package com.itcast.dao;

import com.itcast.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ljfeng on 2017/7/24.
 */
// 必须配置@component或者@Repository，这样spring才能识别该Bean
@Repository
public interface UserDao {
    User getUserById(int userId);
    int deleteUserById(int userId);
    int insert(User user);
    int updateUser(User user);

    // 多输入参数，使用 @Param 注解
    List<User> getUsers(@Param("start") int start, @Param("end") int end);
}
