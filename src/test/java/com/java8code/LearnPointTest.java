package com.java8code;

import com.mycomp.model.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

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
        Assert.assertFalse(isValidName);
    }
    @Test
    public void whenPersonNull(){
        person = null;
        boolean isValidName = learnPoint.isNameValid("PRADYUMNA", Optional.ofNullable(person));
        Assert.assertFalse(isValidName);
    }

    @Test
    public void whenPersonNameIsNull(){
        boolean isValidName = learnPoint.isNameValid("PRADYUMNA", Optional.ofNullable(person));
        Assert.assertFalse(isValidName);
    }
}