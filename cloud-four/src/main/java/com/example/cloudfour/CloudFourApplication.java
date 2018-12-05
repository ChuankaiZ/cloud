package com.example.cloudfour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudFourApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudFourApplication.class, args);
	}
}
