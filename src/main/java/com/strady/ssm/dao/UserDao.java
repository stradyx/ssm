package com.strady.ssm.dao;

import com.strady.ssm.entity.User;
import com.strady.ssm.entity.UserOrders;

import java.util.List;

/**
 * @Author: strady
 * @Date: 2019-10-13
 * @Time: 15:05:46
 * @Description:
 */
public interface UserDao {

    User findUserById(String id);

    List findUserByName(String userName);

    UserOrders findUserOrdersById(String id);

    void insertUser(User user);

    void deleteUser(String id);

    void updateUser(User user);
}
