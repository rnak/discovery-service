package com.ronak.eureka.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoApplication {

	public static void main(String[] args) {
        System.out.println("discovery service is going on the fly.");
		SpringApplication.run(DemoApplication.class, args);
	}

}
