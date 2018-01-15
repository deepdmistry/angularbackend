package com.helloworld.angularbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class AngularBackendApplication extends SpringBootServletInitializer {

	/*public static void main(String[] args) {
		SpringApplication.run(AngularBackendApplication.class, args);
	}*/

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AngularBackendApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(AngularBackendApplication.class, args);
	}
}
