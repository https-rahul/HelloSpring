package com.helloSpring.com.HelloSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import rest.FunRestController;

@SpringBootApplication
@ComponentScan(basePackageClasses = FunRestController.class)
public class HelloSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloSpringApplication.class, args);
	}

}