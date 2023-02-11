package com.java8code;

import java.util.Map;
import java.util.Optional;

public class StaticUtils {

    private StaticUtils() {}

    public static String name() {
        return "Baeldung";
    }

    public static String getString(Map<String,String> eventFields,String key){
        return Optional.ofNullable(eventFields).map(e->e.get(key)).orElse("");
    }
}
