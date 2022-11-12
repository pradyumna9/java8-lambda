package com.java8code;

import com.mycomp.model.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LineReaderTest {

    @InjectMocks
    private LineReader lineReader;

    @Test
    public void fileTest() throws IOException {
        String fileName = "person-data.txt";
        Path path = Paths.get("src","test","resources",fileName);
        List<Person> persons =  lineReader.getPersonFromFile(path);
        Assert.assertEquals("Dipu",persons.get(0).getName());
        Assert.assertEquals("Baby",persons.get(1).getName());
        Assert.assertEquals("BABY",persons.get(2).getName());
    }
}