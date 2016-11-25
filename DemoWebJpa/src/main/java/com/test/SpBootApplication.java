/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpBootApplication {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(new Object[] { SpBootApplication.class });
		app.setBannerMode(Mode.CONSOLE);
		app.run(args);
	}
}