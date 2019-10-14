package com.strady.ssm.service;

import com.strady.ssm.entity.User;
import com.strady.ssm.entity.UserOrders;

import java.util.List;

/**
 * @Author: strady
 * @Date: 2019-10-14
 * @Time: 10:48:30
 * @Description:
 */
public interface UserService {

    User findUser(String id);

    List findUsers(String userName);

    UserOrders findUserOrders(String orderId);

    void insertUser(User user);

    void deleteUser(String id);

    void updateUser(User user);
}
