package com.demo.junit;

public class Mymath {

	public int calculateSum(int[] nums) {
		int sum = 0;
		for (int n : nums) {
			sum = +n;
		}
		return sum;
	}

}
