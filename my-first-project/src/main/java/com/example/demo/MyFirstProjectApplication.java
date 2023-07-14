package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class MyFirstProjectApplication {
	//AÑADIR ESTO
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(MyFirstProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
		LOGGER.info("An INFO message");
		LOGGER.warn("An WARN message");
		LOGGER.error("An ERROR message");
		LOGGER.debug("An DEBUG message");
		LOGGER.trace("An TRACE message");
		LOGGER.error("An FATAL message");


	}

}
