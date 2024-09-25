package org.example.arrays.multi_dimension_array;

public class AdditionOfTwoArrays {
    public static void main(String[] args) {
        int[][] add1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] add2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] add3 = new int[3][3];
        for (int i = 0; i < add1.length; i++) {
            for (int j = 0; j < add1[i].length; j++) {
                add3[i][j] = add1[i][j] + add2[i][j];

            }
        }
        for (int i = 0; i < add3.length; i++) {
            for (int j = 0; j < add3[i].length; j++) {
                System.out.print(add3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
