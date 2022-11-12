package com.java8code;

import com.mycomp.model.Person;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class LearnPoint {

    public boolean isNameValid(String expectedName, Optional<Person> person){
        return person.map(value -> expectedName.equals(value.getName())).orElse(false);
    }

    public Optional<String> getUidMatchWithName(List<Person> personList, String matchingName){
       return CollectionUtils.emptyIfNull(personList).stream().filter(Objects::nonNull)
               .filter(value -> matchingName.equals(value.getName()))
               .map(Person::getUid).findFirst();
    }
}
