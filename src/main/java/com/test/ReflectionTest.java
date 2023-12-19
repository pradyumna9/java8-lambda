package com.test;


import com.mycomp.model.Person;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class personClass = person.getClass();
        System.out.println(personClass.getName());
        System.out.println(Arrays.stream(personClass.getDeclaredMethods()).collect(Collectors.toList()));
        System.out.println(Modifier.toString(personClass.getModifiers()));
        System.out.println(Arrays.stream(personClass.getAnnotations()).collect(Collectors.toSet()));
        System.out.println(personClass.getSimpleName());
        System.out.println(personClass.getSuperclass().getSimpleName());
    }
}
