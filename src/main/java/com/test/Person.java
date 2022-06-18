package com.test;

import jdk.nashorn.internal.objects.annotations.Getter;


public class Person {

	private String name;
	private int age;
	private String uid;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String uid) {
		super();
		this.name = name;
		this.age = age;
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", uid=" + uid + "]";
	}
	
	
}
