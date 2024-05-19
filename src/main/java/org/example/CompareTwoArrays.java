package org.example;

import java.util.Arrays;

public class CompareTwoArrays {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        int[] b={1,2,3,4,5};
        //Comparing two arrays without range

        if (Arrays.equals(a,b)){
            System.out.println("Equal");
        }
        else
        System.out.println("Not Equal");
        //Comparing two arrays between range of two arrays
        if (Arrays.equals(a,2,3,b,2,3)){
            System.out.println("Equal");
        }
        else
            System.out.println("Not Equal");

    }



}
