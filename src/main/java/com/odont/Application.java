package com.odont;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private static final Logger logger = LogManager.getLogger(Application.class);

	public static void main(String[] args) {
		logger.info("Iniciando la aplicación");
		SpringApplication.run(Application.class, args);
	}
}

//TODO: Basic Run and log
//TODO: Status Controller
//TODO: Show Lombok
//TODO: Show Message Controller
//TODO: Show maven configuration
//TODO: Show server port configuration
//TODO: Show Tomcat vs undertow


