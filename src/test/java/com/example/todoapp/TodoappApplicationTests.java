package com.example.todoapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // Active le profil test
class TodoappApplicationTests {

	@Test
	void contextLoads() {
		// Ce test vérifie simplement que le contexte Spring se charge correctement
	}

}