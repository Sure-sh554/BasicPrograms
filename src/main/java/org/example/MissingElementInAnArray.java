package org.example;

import java.util.Arrays;

public class MissingElementInAnArray

{
    public static void main(String[] args) {
        //Defining the array
        int[] arr=new int[]{1,3,4,5,6,7,8,9,10};
        //See the length of the Array
        System.out.println(arr.length);
        //Add 1 to length to the given Array
        int N=arr.length+1;
        //Find the sum of the Array and this is the expected sum
        int expectedSum=(N*(N+1))/2;
        System.out.println(expectedSum);
        //And also calculate the actual sum
        int actualSum= Arrays.stream(arr).sum();
        System.out.println(actualSum);
        //Find the difference between expected sum and actual sum we will get the actual result
        int missingNumber=expectedSum-actualSum;
        System.out.println(missingNumber);

    }
}
