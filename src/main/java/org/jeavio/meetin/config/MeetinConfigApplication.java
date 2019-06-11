package org.jeavio.meetin.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MeetinConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetinConfigApplication.class, args);
	}

}
