package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DockerJenkinsIntegrationApplication {
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Jenkins Docker integration";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsIntegrationApplication.class, args);
	}

}
