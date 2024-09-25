package org.example.arrays.multi_dimension_array;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{2,3,4},{3,4,5}};
        int[][] transpose=new int[3][3];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                transpose[j][i]=arr[i][j];
            }
        }
        for (int i=0;i<transpose.length;i++){
            for (int j=0;j<transpose[i].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
