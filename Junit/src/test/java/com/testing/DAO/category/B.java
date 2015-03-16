package com.testing.DAO.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class B {

	@Test
	@Category(Slow.class)
	public void testForSlowB() {
		System.out.println("I am a slow service");
	}
	
	@Test
	@Category(Slow.class)
	public void testForAnotherSlowB() {
		System.out.println("I am another slow service");
	}
	
	@Test
	@Category(Fast.class)
	public void testForFastB() {
		System.out.println("I am a fast service");
	}

}
