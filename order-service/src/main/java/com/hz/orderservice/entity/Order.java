package com.hz.orderservice.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2023-01-05 17:48:21
 */
@Data
public class Order implements Serializable {
    private static final long serialVersionUID = -28936739030119197L;
    /**
    * 订单id
    */
    private Long id;
    /**
    * 用户id
    */
    private Long userId;
    /**
    * 名称
    */
    private String name;
    /**
    * 价格
    */
    private Double price;
    /**
    * 数量
    */
    private Integer num;
    /**
     * 用户
     */
    private User user;

}