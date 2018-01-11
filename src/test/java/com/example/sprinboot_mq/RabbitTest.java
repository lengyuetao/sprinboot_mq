package com.example.sprinboot_mq;

import com.example.sprinboot_mq.msg.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class RabbitTest {
    @Autowired
    private Sender sender;

    @Test
    public void send(){
        System.out.println("*****");
    }
}
