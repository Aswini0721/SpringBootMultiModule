package com.sample;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
@EnableScheduling
public class Application extends SpringBootServletInitializer {


	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/sample-otm");
		SpringApplication.run(Application.class, args);
	}

}
