package com.java8code;

import com.mycomp.model.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
public class LearnPointTest {

    @Mock
    private Person person;

    @InjectMocks
    private LearnPoint learnPoint;


    @Test
    public void successTest(){
        Mockito.when(person.getName()).thenReturn("PRADYUMNA");
        boolean isValidName = learnPoint.isNameValid("PRADYUMNA", Optional.of(person));
        Assert.assertTrue(isValidName);
    }
    @Test
    public void whenPersonNameIsDifferent(){
        Mockito.when(person.getName()).thenReturn("BABY");
        boolean isValidName = learnPoint.isNameValid("PRADYUMNA", Optional.of(person));
        assertFalse(isValidName);
    }
    @Test
    public void whenPersonNull(){
        person = null;
        boolean isValidName = learnPoint.isNameValid("PRADYUMNA", Optional.ofNullable(person));
        assertFalse(isValidName);
    }

    @Test
    public void whenPersonNameIsNull(){
        boolean isValidName = learnPoint.isNameValid("PRADYUMNA", Optional.ofNullable(person));
        assertFalse(isValidName);
    }
    @Test
    public void whenPersonListIsNull(){
       Optional<String> result = learnPoint.getUidMatchWithName(null,"ITI");
       assertFalse(result.isPresent());
    }

    @Test
    public void whenSomePersonIsNull(){
        Person person = new Person();
        person.setName("PK");
        person.setUid("123");
        Person person1 = new Person();
        person1.setName("TK");
        person1.setUid("999");
        Person personNull = null;
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person1);
        personList.add(personNull);
        Optional<String> result = learnPoint.getUidMatchWithName(personList,"TK");
        assertEquals("999",result.get());
    }

    @Test
    public void whenPersonListIsEmpty(){
       List<Person> personList = Collections.emptyList();
        Optional<String> result = learnPoint.getUidMatchWithName(personList,"TK");
        assertFalse(result.isPresent());
    }
}