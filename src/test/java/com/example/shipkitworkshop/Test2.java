package com.example.shipkitworkshop;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Test2 {
	@Test
	public void shouldCreateTriangle2() {
		assertTrue(MathUtils.isTriangle(3, 4, 5));
		assertTrue(MathUtils.isTriangle(6, 7, 8));
	}

}
