package org.example.arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxElement {
    public static int maxElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
        return max;
    }
    public static int maxElementByJava8(int[] array) {
        OptionalInt max= Arrays.stream(array).max();
        System.out.println(max);
        return max.getAsInt();
    }
}
