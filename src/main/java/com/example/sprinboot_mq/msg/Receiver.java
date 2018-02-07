package com.example.sprinboot_mq.msg;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "test")
public class Receiver{

    @RabbitHandler
    public void process(String message){
        System.out.println("------消费者："+message);
    }
}
