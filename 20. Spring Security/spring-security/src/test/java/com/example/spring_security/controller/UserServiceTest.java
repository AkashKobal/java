package com.example.spring_security.controller;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {
	@Autowired
	private UserService userService;

	@Test
	public void saveUser() {
		User user = null;
		User expected = null;
		User actual = userService.saveUser(user);

		assertEquals(expected, actual);
	}
}
