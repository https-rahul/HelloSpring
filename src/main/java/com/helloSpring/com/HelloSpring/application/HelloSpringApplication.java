package com.helloSpring.com.HelloSpring.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import rest.FunRestController;
import rest.InjectionController;

@SpringBootApplication(scanBasePackages = "com.helloSpring.com.HelloSpring.*")
@Configuration
@ComponentScan(basePackages = "com.helloSpring.com.HelloSpring")
@ComponentScan(basePackageClasses = FunRestController.class)
@ComponentScan(basePackageClasses = InjectionController.class)
@ComponentScan(basePackages = "com.helloSpring.com.HelloSpring.*")
public class HelloSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloSpringApplication.class, args);
	}

}


//hello change 2