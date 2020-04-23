package com.example.design_patterns.b_structural.adapter.EAMPLE_1;

import java.util.Arrays;
import java.util.List;

public class AdapterEverydayDemo {

	public static void main(String args[]) {
		
		Integer[] arrayOfInts = new Integer[] { 42, 43, 44 };

		System.out.println(arrayOfInts);
		System.out.println(Arrays.toString(arrayOfInts)); // adapter 1

		List<Integer> listOfInts = Arrays.asList(arrayOfInts); // adapter 2
		System.out.println(listOfInts);
		
	}
}
