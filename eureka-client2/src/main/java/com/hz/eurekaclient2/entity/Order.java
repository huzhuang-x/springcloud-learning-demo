package com.hz.eurekaclient2.entity;

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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

}