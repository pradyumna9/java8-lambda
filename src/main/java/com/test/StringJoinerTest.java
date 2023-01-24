package com.test;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {

		StringJoiner sj = new StringJoiner(",", "[", "]");
		sj.add("one").add("two").add("three");
		String result = sj.toString();
		System.out.println(result);

		String[] test = new String[]{"one", "two", "three"};
		String str = String.join(" | ", test);
		System.out.println(str);

	}

}