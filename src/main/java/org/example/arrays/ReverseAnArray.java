package org.example.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseAnArray {
    public static int[] reverseAnArray(int[] array) {
        int length = array.length;
        if (length == 1) {
            System.out.println("As length of the Array is 1 reversing an array is not possible");
        } else {
            for (int i = 0; i < length / 2; i++) {
                int temp = array[i];
                array[i] = array[length - 1 - i];
                array[length - 1 - i] = temp;
            }

        }
        return array;
    }
}

//    public static int[] reverseAnArrayByJava8(int[] array) {
//        int length = array.length;
//        int[] reverse = Arrays.stream(array)
//                .boxed()
//                .sorted(Collections.reverseOrder())
//                .mapToInt(Integer::intValue).toArray();
//        return reverse;
//    }


