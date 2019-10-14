package com.strady.ssm.entity;

import lombok.Data;

/**
 * @Author: strady
 * @Date: 2019-10-11
 * @Time: 16:56:19
 * @Description:
 */
@Data
public class User {
    private String id;

    private String userName;

    private String password;

    private String mobile;

    private Long createTime;
}
