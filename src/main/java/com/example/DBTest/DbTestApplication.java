package com.example.DBTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.DBTest")
@EnableAutoConfiguration
public class DbTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbTestApplication.class, args);
	}

}
