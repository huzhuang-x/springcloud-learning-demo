package com.hz.eurekaclient2.controller;

import com.hz.eurekaclient2.entity.Order;
import com.hz.eurekaclient2.entity.User;
import com.hz.eurekaclient2.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2023-01-05 17:48:21
 */
@RestController
@RequestMapping("order")
public class OrderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;

    @Resource
    private RestTemplate restTemplate;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Order selectOne(Long id) {
        Order order = this.orderService.queryById(id);
        // 调用用户服务查询user信息
        User user = restTemplate.getForObject("http://userservice/user/selectOne?id=" + order.getUserId(), User.class);
        order.setUser(user);
        return order;
    }

}