package com.strady.ssm.dao;

import com.strady.ssm.entity.OrderUser;

/**
 * @Author: strady
 * @Date: 2019-10-13
 * @Time: 21:13:28
 * @Description:
 */
public interface OrderDao {

    OrderUser findOrderUserById(String orderId);
}
