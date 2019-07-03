package com.example.bootstrapspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.bootstrapspringboot.repo")
@EntityScan("com.example.bootstrapspringboot.entity")
@SpringBootApplication
public class BootstrapspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapspringbootApplication.class, args);
	}

}
