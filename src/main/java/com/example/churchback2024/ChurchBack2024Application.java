package com.example.churchback2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing //Base Entity
public class ChurchBack2024Application {

	public static void main(String[] args) {
		SpringApplication.run(ChurchBack2024Application.class, args);
	}

}
