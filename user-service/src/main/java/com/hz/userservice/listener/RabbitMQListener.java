package com.hz.userservice.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQListener {

    @RabbitListener(queues = "simple.queue")
    public void receive(String msg) {
        System.out.println(msg);
    }
}
