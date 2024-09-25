package org.example.arrays.multi_dimension_array;

public class ProductOfDiagonalElements {
    public static void main(String[] args) {
        int[][]a={{1,2,3},{4,5,6},{7,8,9}};
        int product=1;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if (i==j){
                    product*=a[i][j];
                }
            }
        }
        System.out.println(product);

    }
}
