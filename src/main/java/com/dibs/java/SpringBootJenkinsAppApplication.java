package com.dibs.java;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootJenkinsAppApplication {
	
	@PostConstruct
	public void init() {
		log.info("Application Started..");
	}
	
	public static void main(String[] args) {
		log.info("Application running..");
		SpringApplication.run(SpringBootJenkinsAppApplication.class, args);
	}

}
