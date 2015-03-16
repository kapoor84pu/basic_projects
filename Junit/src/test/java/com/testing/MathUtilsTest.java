package com.testing;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class MathUtilsTest {	
	private int numberA;
	private int numberB;
	private int expected;
 
	//parameters pass via this constructor
	public MathUtilsTest(int numberA, int numberB, int expected) {
		this.numberA = numberA;
		this.numberB = numberB;
		this.expected = expected;
	}
 
	//Declares parameters here
	@Parameters
	public static List<Integer[]> data1() {		
		Integer[][] dataObjects = new Integer[][] {	
											{ 1, 1, 2 }, 
											{ 2, 2, 4 }, 
											{ 8, 2, 10 }, 
											{ 4, 5, 9 } 
										   };
		return Arrays.asList(dataObjects);		
	}
 
	@Test
	public void test_add() {	
		assertEquals(expected,MathUtils.add(numberA, numberB));
	}
}
