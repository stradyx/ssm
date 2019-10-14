package com.strady.ssm.entity;

import lombok.Data;

/**
 * @Author: strady
 * @Date: 2019-10-13
 * @Time: 21:09:29
 * @Description:
 */
@Data
public class OrderUser {

    private String id;

    private String orderNo;

    private String uid;

    private String createTime;

    private User user;
}
