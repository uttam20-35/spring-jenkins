package com.crossasyst.springjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application Started...");
	}
	public static void main(String[] args) {
		logger.info("Application Executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}


}
