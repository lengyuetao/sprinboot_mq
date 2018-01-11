package com.example.sprinboot_mq.msg;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {

    @Autowired
    private AmqpTemplate template;

    public void send(){
        String context="hello"+new Date();
        System.out.println("生产者");
        this.template.convertAndSend("hello",context);
    }
}
