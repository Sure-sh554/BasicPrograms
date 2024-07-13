package org.example.arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinElement {
    public static int minElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
        return min;
    }
    public static int minElementByJava8(int[] array) {
       OptionalInt min= Arrays.stream(array).min();
        System.out.println(min);
       return min.getAsInt();
    }
    // Explanation
//    int [] array= {1,2,3,4,5};
//    assign a min value as min
//    int min=array[0];
//    traverse all the elements in the array
//    by using the technique that
//for(int i=1;i<array.length;i++){
//
//        if(min>array[i])
//            min=array[i]
}
