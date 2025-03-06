package com.codingTest;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//find the duplicate number
public class DuplicateNumberTest {
    public static void main(String[] args) {
        int[] num = {3,4,5,6,7,7,8,9,9,9,55,55,55};
        List<Integer> numList = Arrays.stream(num).boxed().collect(Collectors.toList());
        Map<Integer, Integer> duplicateCountMap = new HashMap<>();
        for(int i=0;i<num.length;i++){
            if(duplicateCountMap.containsKey(num[i])){
                duplicateCountMap.put(num[i],duplicateCountMap.get(num[i])+1);
            }
            else{
                duplicateCountMap.put(num[i],1);
            }
        }
        System.out.println(duplicateCountMap);
        Map<Integer, Long> collect = numList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        List<Integer> duplicateNumber = duplicateCountMap.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicateNumber);


    }
}