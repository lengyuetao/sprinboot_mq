package com.example.sprinboot_mq;

import com.example.sprinboot_mq.msg.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SprinbootMqApplication {
	@Autowired
	private static Sender sender;

	public static void main(String[] args) {
		SpringApplication.run(SprinbootMqApplication.class, args);
	}
}
