package com.user.userTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.user.userTask")
public class UserTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserTaskApplication.class, args);
	}

}
