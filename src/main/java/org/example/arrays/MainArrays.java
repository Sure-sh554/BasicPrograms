package org.example.arrays;

import java.util.Arrays;

public class MainArrays {
    public static void main(String[] args) {
//        SumOfAllElementsInTheArray.sumOfAllTheElementsInTheArray(new int[]{1, 2, 3, 4, 5});
//        SumOfAllElementsInTheArray.sumOfAllTheElementsInTheArray(new int[]{10, 20, 30});
//        SumOfAllElementsInTheArray.sumOfAllTheElementsInTheArrayUsingJava8(new int[]{100, 200});

//        MinElement.minElement(new int[]{1,2,3,4,5});
//        MinElement.minElement(new int[]{-10, 20, 30});
//        MinElement.minElementByJava8(new int[]{100, 200});

//        MaxElement.maxElement(new int[]{1, 2, 3, 4, 5});
//        MaxElement.maxElementByJava8(new int[]{-10, 20, 30});
        int[] orginalArray={4};// orginalArray= a123 (reference value)

        ReverseAnArray.reverseAnArray(orginalArray);
        System.out.println(Arrays.toString(orginalArray));

    }
}
