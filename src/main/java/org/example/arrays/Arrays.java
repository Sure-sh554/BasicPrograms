package org.example.arrays;

public class Arrays {
    public static void main(String[] args) {
        int [] arrays=new int[]{1,2,3,4,5};
        System.out.println(arrays[3]);
        arrays[3]=6;
        System.out.println(arrays);// hash code
        for (int i=0;i<arrays.length;i++ ){
            System.out.print(arrays[i]+" ");
        }

    }
}
