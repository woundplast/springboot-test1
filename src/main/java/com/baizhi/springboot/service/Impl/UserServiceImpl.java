package com.baizhi.springboot.service.Impl;

import com.baizhi.springboot.dao.UserDao;
import com.baizhi.springboot.entity.User;
import com.baizhi.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

}
