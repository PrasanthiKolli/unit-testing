package com.demo.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	
	Mymath mymath= new Mymath();

	@Test
	void calculatesumtest() {
		
		int res1 = mymath.calculateSum(new int[] {1,2,3});
		
		assertEquals(6, res1);
	}

}
