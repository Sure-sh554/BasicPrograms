package org.example.streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FactorialOfANumber {
    public static void main(String[] args) {
        // classic way
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

        // using streams
        Long result = LongStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
        System.out.println(result);
    }
}
