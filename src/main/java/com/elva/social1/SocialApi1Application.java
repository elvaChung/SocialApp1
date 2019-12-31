package com.elva.social1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SocialApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(SocialApi1Application.class, args);
		System.out.println("Welcom parctice1.");
	}

}
