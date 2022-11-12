package com.java8code;

import com.mycomp.model.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class LineReader {

    public List<Person> getPersonFromFile(Path path) throws IOException {
       return Files.readAllLines(path).stream().map(p -> {
            String[] personSplit = p.split(" ");
            Person person = new Person();
            person.setName(personSplit[0]);
            person.setAge(Integer.parseInt(personSplit[1]));
            person.setUid(personSplit[2]);
            return person;
        }).collect(Collectors.toList());
    }
}
