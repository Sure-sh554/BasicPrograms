package org.example.arrays;

import java.util.Arrays;

public class SumOfAllElementsInTheArray {
    public static int sumOfAllTheElementsInTheArray(int[] arr) {
        // int[] arr={1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static void sumOfAllTheElementsInTheArrayUsingJava8(int[] arr) {
        int i = Arrays.stream(arr).sum();
        System.out.println(i);
    }
}
