package com.example.todoapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@TestPropertySource(locations = "classpath:application-test.properties")
class TodoappApplicationTests {

	@Value("${spring.datasource.url}")
	private String datasourceUrl;

	@Test
	void contextLoads() {
		System.out.println("Tests running with database: " + datasourceUrl);
		// Cela vous montrera quelle configuration est utilisée
	}
}
