package com.test;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration
public class SpBootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpBootApplication.class, args);
		
		SpringApplication app = new SpringApplication(SpBootApplication.class);
	    app.setBannerMode(Banner.Mode.CONSOLE);
	    app.run(args);
	}
	
	
}
