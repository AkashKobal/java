package com.example.spring_security.controller;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfigTest {
	@Test
	public void securityFilterChain() throws Exception {
		SecurityConfig s = new SecurityConfig();
		HttpSecurity http = null;
		SecurityFilterChain expected = null;
		SecurityFilterChain actual = s.securityFilterChain(http);

		assertEquals(expected, actual);
	}
}
