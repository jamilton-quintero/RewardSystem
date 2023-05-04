package com.jamiltonquintero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@ComponentScan({ "com.jamiltonquintero" })
@SpringBootApplication
@EnableAsync(proxyTargetClass = true)
public class RewardsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardsystemApplication.class, args);
	}

}
