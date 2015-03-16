package com.testing.DAO;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(PersonServiceTest.class)
public class SampleTest {
	
	@Test
	public void test() {
		System.out.println("Trying few sample test");
	}

}
