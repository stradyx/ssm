package com.strady.ssm.controller;

import com.strady.ssm.entity.OrderUser;
import com.strady.ssm.entity.User;
import com.strady.ssm.entity.UserOrders;
import com.strady.ssm.service.OrdersService;
import com.strady.ssm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @Author: strady
 * @Date: 2019-10-13
 * @Time: 13:58:40
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private OrdersService ordersService;

    /**
     * 根据id查找用户
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public String find(@RequestParam String id) {
        User user = userService.findUser(id);
        return user != null ? user.toString() : "null";
    }

    /**
     * 根据userName查找用户
     *
     * @param userName
     * @return
     */
    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String list(@RequestParam String userName) {
        List<User> users = userService.findUsers(userName);
        users.forEach(user -> {
            System.out.println(user.toString());
        });
        return users != null ? users.toString() : "null";
    }

    /**
     * 添加用户
     *
     * @param userName
     * @param mobile
     * @param password
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(@RequestParam String userName,
                    @RequestParam String mobile,
                    @RequestParam String password) {
        User user = new User();
        user.setId(UUID.randomUUID().toString().replace("-", ""));
        user.setCreateTime(System.currentTimeMillis());
        user.setUserName(userName);
        user.setPassword(password);
        user.setMobile(mobile);

        userService.insertUser(user);
    }

    /**
     * 删除用户
     *
     * @param id
     * @throws IOException
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(@RequestParam String id) {
        userService.deleteUser(id);
    }

    /**
     * 更新用户信息
     *
     * @param id
     * @param userName
     * @param mobile
     * @throws IOException
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void update(@RequestParam String id,
                       @RequestParam String userName,
                       @RequestParam String mobile) {
        User user = userService.findUser(id);
        user.setUserName(userName);
        user.setMobile(mobile);
        userService.updateUser(user);
    }

    /**
     * 查找订单和用户信息
     *
     * @param orderId
     * @return
     */
    @RequestMapping(value = "/orderUser", method = RequestMethod.GET)
    public String orderUser(@RequestParam String orderId) {
        OrderUser orderUser = ordersService.findOrderUser(orderId);
        return orderUser != null ? orderUser.toString() : "null";
    }

    /**
     * 查找用户信息和订单
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/userOrders", method = RequestMethod.GET)
    public String userOrders(@RequestParam String id) {
        UserOrders userOrders = userService.findUserOrders(id);
        return userOrders != null ? userOrders.toString() : "null";
    }
}
