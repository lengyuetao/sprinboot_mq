package com.example.sprinboot_mq.msg;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Bean
    public Queue heloQueue(){
        return new Queue("hello");
    }
}
