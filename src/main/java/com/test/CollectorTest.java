package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorTest {
public static void main(String[] args) {
	
	List<Person> persons = new ArrayList<>();
	
	try(
			BufferedReader reader =
		new BufferedReader(new InputStreamReader(Objects.requireNonNull(CollectorTest.class.getResourceAsStream("person-data"))));
			Stream<String> lines = reader.lines();
		){
		lines.map(x -> {
			String[] word = x.split(" ");
			Person p = new Person(word[0], Integer.parseInt(word[1]), word[2]);
			persons.add(p);
			return p;
		}).forEach(System.out::println);;
		
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	//Minimum Age more than 20
	Optional<Person> opt=
	persons.stream().filter(x -> x.getAge()>20).min(Comparator.comparing(Person::getAge));
	System.out.println(opt);
	
	//Maximum age less thn 20
	Optional<Person> opt2 = 
			persons.stream().filter(x -> x.getAge()<20).max(Comparator.comparing(Person::getAge));
	System.out.println(opt2);
	
	//Grouping By age
	
	Map<Integer,List<Person>> agePersonMap= persons.stream().collect(Collectors.groupingBy(Person::getAge));
	System.out.println(agePersonMap);
	
	//Grouping By Age and counting number of repeatation
	Map<Integer,Long> ageCountMap  = persons.stream().collect(Collectors.groupingBy(Person::getAge,Collectors.counting()));
	System.out.println(ageCountMap);
	
	//Grouping by Age and Corresponding Name
		Map<Integer,List<String>>ageNameMap= persons.stream().collect(Collectors.groupingBy(Person::getAge,Collectors.mapping(Person::getName,Collectors.toList())));
		System.out.println(ageNameMap);
		
	
	//Grouping by Age and Corresponding Name In order
	Map<Integer,Set<String>>ageNameOrderMap= persons.stream().collect(Collectors.groupingBy(Person::getAge,Collectors.mapping(Person::getName,Collectors.toCollection(TreeSet<String>::new))));
	System.out.println(ageNameOrderMap);
	
	System.out.print("abc".equals("ABC"));	
	
	
}
}
