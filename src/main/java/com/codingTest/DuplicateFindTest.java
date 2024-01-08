package com.codingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateFindTest {
    public static void main(String[] args) {
        int[] x ={1,2,3,4,2,4,5,8,9};
        ArrayList numberList = duplicates(x,7);
        System.out.println(numberList);

    }
        public static ArrayList<Integer> duplicates(int arr[], int n) {
            // code here
            Map<Integer,Integer> numberCount = new HashMap();
            for(int i=0;i<n;i++){
                if(!numberCount.containsKey(arr[i])){
                    numberCount.put(arr[i],1);
                }
                else{
                    numberCount.put(arr[i],numberCount.get(arr[i])+1);
                    System.out.println("Duplicate Number "+arr[i]);
                }
            }
        return (ArrayList<Integer>) numberCount.entrySet().stream().filter(e -> e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());

        }

}
