package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionTest {
	public static void main(String[] args) {

		//List<Integer> intList = Arrays.asList(10,12);
		//List<Integer> intList = Arrays.asList(-10,-8,-8);
		List<Integer> intList = Arrays.asList();
		int x = intList.stream().reduce(0,Integer::sum);
		//System.out.println(x);
		
		Optional<Integer> maxNumber = intList.stream().reduce(Integer::max);
		System.out.println(maxNumber);
	}
}
