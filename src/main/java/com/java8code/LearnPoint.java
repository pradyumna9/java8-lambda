package com.java8code;

import com.mycomp.model.Person;

import java.util.Optional;

public class LearnPoint {

    public boolean isNameValid(String expectedName, Optional<Person> person){
        return person.map(value -> expectedName.equals(value.getName())).orElse(false);
    }
}
