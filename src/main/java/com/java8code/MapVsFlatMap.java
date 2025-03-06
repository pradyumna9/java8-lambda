package com.java8code;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("STACK","OOVER");
        List<String[]> stringsArrayList = stringList.stream().map(s -> s.split("")).distinct().collect(Collectors.toList());
        stringsArrayList.forEach(System.out::println);

        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> stringList1 = namesNested.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(stringList1);

    }
}
