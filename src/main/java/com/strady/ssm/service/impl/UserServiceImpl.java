package com.strady.ssm.service.impl;

import com.strady.ssm.dao.UserDao;
import com.strady.ssm.entity.User;
import com.strady.ssm.entity.UserOrders;
import com.strady.ssm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: strady
 * @Date: 2019-10-14
 * @Time: 10:49:18
 * @Description:
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User findUser(String id) {
        return userDao.findUserById(id);
    }

    @Override
    public List findUsers(String userName) {
        return userDao.findUserByName(userName);
    }

    @Override
    public UserOrders findUserOrders(String orderId) {
        return userDao.findUserOrdersById(orderId);
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void deleteUser(String id) {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
