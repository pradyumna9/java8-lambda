package com.java8code;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StaticUtils {

    private StaticUtils() {}

    public static String name() {
        return "Baeldung";
    }

    public static String getString(Map<String,String> eventFields,String key){
        return Optional.ofNullable(eventFields).map(e->e.get(key)).orElse("");
    }
}
