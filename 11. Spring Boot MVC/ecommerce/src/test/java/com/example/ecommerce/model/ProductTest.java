package com.example.ecommerce.model;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
	@Test
	public void Product() {
		int i = 123;
		Product expected = new Product(123);
		Product actual = new Product(i);

		assertEquals(expected, actual);
	}
}
