package org.example;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopWithIndex {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};

        int i=0;
        for (int index:arr) {
            System.out.println(index+" "+i++);

        }
    }
}
