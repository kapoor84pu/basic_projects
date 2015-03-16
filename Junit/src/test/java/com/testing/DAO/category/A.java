package com.testing.DAO.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class A {

	@Test
	@Category(Slow.class)
	public void testForSlowA() {
		System.out.println("I am a slow service");
	}
	
	@Test
	@Category(Slow.class)
	public void testForAnotherSlowA() {
		System.out.println("I am another slow service");
	}
	
	@Test
	@Category(Fast.class)
	public void testForFastA() {
		System.out.println("I am a fast service");
	}
}
