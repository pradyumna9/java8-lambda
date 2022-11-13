package com.java8code;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycomp.model.Person;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.json.JSONException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.skyscreamer.jsonassert.JSONCompare;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.JSONCompareResult;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LineReaderTest {

    @InjectMocks
    private LineReader lineReader;
    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void fileTest() throws IOException, JSONException {
        Path path = getPath("person-data.txt");
        Path jsonFile = getPath("person.json");
        List<Person> persons =  lineReader.getPersonFromFile(path);
        String expectedJsonFile = new String(Files.readAllBytes(jsonFile));
        String jsonPersonAsString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(persons);
        JSONCompareResult jsonCompareResult = JSONCompare.compareJSON(expectedJsonFile,jsonPersonAsString, JSONCompareMode.STRICT);
        System.out.println(jsonCompareResult.getMessage());
        Assert.assertTrue(jsonCompareResult.passed());
    }

    private Path getPath(String fileName) {
        return Paths.get("src","test","resources",fileName);
    }
}