package com.strady.ssm.entity;

import java.util.List;

/**
 * @Author: strady
 * @Date: 2019-10-13
 * @Time: 21:09:36
 * @Description:
 */
public class UserOrders {

    private String id;

    private String userName;

    private String password;

    private String mobile;

    private Long createTime;

    private List<Orders> orders;
}
