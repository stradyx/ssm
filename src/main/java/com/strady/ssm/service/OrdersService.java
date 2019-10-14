package com.strady.ssm.service;

import com.strady.ssm.entity.OrderUser;

/**
 * @Author: strady
 * @Date: 2019-10-14
 * @Time: 10:49:09
 * @Description:
 */
public interface OrdersService {

    OrderUser findOrderUser(String orderId);
}
