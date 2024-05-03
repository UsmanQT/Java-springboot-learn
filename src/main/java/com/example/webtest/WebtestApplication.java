package com.example.webtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

@ComponentScan("com.example.controller")
@SpringBootApplication
public class WebtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebtestApplication.class, args);
	}

}
