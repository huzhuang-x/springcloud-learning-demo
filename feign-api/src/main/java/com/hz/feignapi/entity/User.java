package com.hz.feignapi.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2023-01-05 17:36:21
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 435254911202565473L;
    /**
    * 用户id
    */
    private Long id;
    /**
    * 用户名
    */
    private String username;
    /**
    * 地址
    */
    private String address;

}