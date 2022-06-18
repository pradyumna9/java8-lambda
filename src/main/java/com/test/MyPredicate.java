package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MyPredicate {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("dip","lipu","bab","bin");
		Predicate<String> nameLength = x -> x.length() >3;
		Predicate<String> nameStartWith = Predicate.isEqual("bin");
		//nameList.stream().filter(nameLength.or(nameStartWith)).forEach(System.out::println);
		List<String> newList = new ArrayList<>();
		//peek is intermediary function and for each is terminal function
		//In case of peek it will not add to the list as its not final function its any intermediary operation.
		nameList.stream().peek(System.out::println).filter(nameLength.or(nameStartWith)).forEach(newList::add);
		System.out.println("name length:"+newList.size());

	}



}
