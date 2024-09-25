package org.example.arrays.multi_dimension_array;

public class SubOfTwoArrays {
    public static void main(String[] args) {
        int[][] sub1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] sub2={{9,8,7},{6,5,4},{3,2,1}};
        int[][] sub3=new int[3][3];
        for (int i=0;i<sub1.length;i++){
            for(int j=0;j<sub1[i].length;j++){
                sub3[i][j]=sub1[i][j]-sub2[i][j];
            }
        }
        for (int i=0;i<sub3.length;i++){
            for (int j=0;j<sub3[i].length;j++){
                System.out.print(sub3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
