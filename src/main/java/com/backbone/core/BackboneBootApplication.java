package com.backbone.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackboneBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackboneBootApplication.class, args);
		
		System.out.println("### hello, Backbone Boot ###");
	}

}
