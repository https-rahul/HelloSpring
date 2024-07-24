package com.helloSpring.com.HelloSpring.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.helloSpring.com.HelloSpring.rest.FunRestController;
import com.helloSpring.com.HelloSpring.rest.InjectionController;

@Slf4j
@SpringBootApplication(scanBasePackages = "com.helloSpring.com.HelloSpring.*")
@Configuration
@ComponentScan(basePackages = "com.helloSpring.com.HelloSpring")
@ComponentScan(basePackageClasses = FunRestController.class)
@ComponentScan(basePackageClasses = InjectionController.class)
@ComponentScan(basePackages = "com.helloSpring.com.HelloSpring.*")
public class HelloSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloSpringApplication.class, args);
		log.info("application started");
	}

}