package com.java8code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("STACK","OOVER");
        List<String[]> stringsArrayList = stringList.stream().map(s -> s.split("")).distinct().collect(Collectors.toList());
        stringsArrayList.stream().forEach(System.out::println);
    }
}
