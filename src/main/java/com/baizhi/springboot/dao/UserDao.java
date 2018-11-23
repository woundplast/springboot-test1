package com.baizhi.springboot.dao;

import com.baizhi.springboot.entity.User;

import java.util.List;

public interface UserDao {
    List<User> queryAll();
}
