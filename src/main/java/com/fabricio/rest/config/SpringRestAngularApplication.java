package com.fabricio.rest.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fabricio")
public class SpringRestAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestAngularApplication.class, args);		
	}

}
