package com.example.restaurantsserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RestaurantsServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantsServerApplication.class, args);
	}

}
