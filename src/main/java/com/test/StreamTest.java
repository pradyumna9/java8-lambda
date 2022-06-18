package com.test;

import com.mycomp.model.Person;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {

	public static void main(String[] args) {
		List<Person> person = new ArrayList<Person>();
		person.add(new Person("dipu", 29, "BTBPD8977L"));
		person.add(new Person("baby", 25, "X12T568s"));
		person.add(new Person("kalia", 79, "JKL00928NM"));
		person.add(new Person("Sipu", 21, "JKL00928NM"));
		person.add(new Person("Fq", 13, "JKL00928NM"));
		
		
		
		List<Person> person1 = new ArrayList<Person>();
		person1.add(new Person(null, 11, "KSLSKSKS"));
		//person1.add(null);
		person1.add(new Person("sana", 11, "KSLSKSKS"));
		person1.add(new Person("jhadu", 65, "LSKSKSKS"));
		
		
		//skip 2 lines and limit 2lines(intermediate)
		person.stream().skip(2).limit(2).forEach(System.out::println);
		
		//terminal method
		boolean pa = person.stream().anyMatch(p1 -> p1.getAge()>70);
		boolean pb = person.stream().noneMatch(p1 -> p1.getAge()>90);
		boolean pc = person.stream().allMatch(p1 -> p1.getAge()>10);
		System.out.println(pb);
		
		Person p9 = person.stream().findFirst().orElse(null);
		System.out.println(p9);
//		
//		Map<String,List<Person>> personMap = new HashMap<>();
//		personMap.put("dipu", person);
//		personMap.put("other", person1);
//		
//		//Task is to create a map and populate dipu details like dipu code and details
//		
//		Map<String,Person> newMap = new HashMap<>();
//		personMap.getOrDefault("dipu1", person1).forEach(p1 -> newMap.put(p1.getUid(), p1));
//		newMap.entrySet().forEach(System.out::println);
		
		//List<Person> per = person1.stream().filter(Objects::nonNull).filter(Person.get::isEmpty)).filter(p->p.getName().equals("sana")).collect(Collectors.toList());
		//per.forEach(System.out::println);
		//person.stream().filter(x -> x.getAge()>26).forEach(System.out::println);
		//person.stream().map(Person::getAge).peek(System.out::println).filter(x -> x>26).peek(System.out::println);
	}
}
