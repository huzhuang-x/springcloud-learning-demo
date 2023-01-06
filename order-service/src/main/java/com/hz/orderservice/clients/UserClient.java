package com.hz.orderservice.clients;

import com.hz.orderservice.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "userservice")
public interface UserClient {
    @GetMapping("/user/selectOne")
    User findById(@RequestParam Long id);
}
