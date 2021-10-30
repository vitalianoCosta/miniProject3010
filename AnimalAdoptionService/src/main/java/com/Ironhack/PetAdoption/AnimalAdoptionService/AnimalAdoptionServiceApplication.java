package com.Ironhack.PetAdoption.AnimalAdoptionService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class AnimalAdoptionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalAdoptionServiceApplication.class, args);
	}

}
