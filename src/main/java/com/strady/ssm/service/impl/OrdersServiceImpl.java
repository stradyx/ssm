package com.strady.ssm.service.impl;

import com.strady.ssm.dao.OrderDao;
import com.strady.ssm.entity.OrderUser;
import com.strady.ssm.service.OrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: strady
 * @Date: 2019-10-14
 * @Time: 10:49:41
 * @Description:
 */
@Slf4j
@Service
public class OrdersServiceImpl implements OrdersService {


    @Autowired
    private OrderDao orderDao;


    @Override
    public OrderUser findOrderUser(String orderId) {
        return orderDao.findOrderUserById(orderId);
    }
}
