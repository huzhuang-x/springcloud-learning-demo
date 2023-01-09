package com.hz.userservice.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Test
    public void receive() {
        String queueName = "simple.queue";
        Object message = "Hello，Spring AMQP";
        Object convert = rabbitTemplate.receiveAndConvert(queueName);
        System.out.println("111");
    }
}
