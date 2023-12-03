package com.codingTest;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberTest {

    public static void main(String[] args) {
       long count  = Stream.iterate(0,n->n+1).limit(10).filter(PrimeNumberTest::isPrime)
               .peek(System.out::println).count();
        System.out.println("Prim Number Count:"+count);
    }

    private static boolean isPrime(int n) {
        return n > 1 && IntStream.rangeClosed(2, n / 2).noneMatch(i -> n % i == 0);

    }
}
