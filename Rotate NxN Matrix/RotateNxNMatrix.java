package com.learn;

public class RotateNxNMatrix {

    public static void main(String[] args) {
	// write your code here

        //1 2 3
        //4 5 6
        //7 8 9
        int n = 4;

        int[][] matrix = new int[n][n];

        for(int i=0; i< n; i++){
            for(int j=0; j < n; j++){
                matrix[i][j] = i;
            }
        }

        matrix = RotateMatrix(matrix);

        for(int i=0; i< n; i++){
            for(int j=0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] RotateMatrix (int[][] matrix){
        int n = matrix.length;
        int temp = 0;

        for(int i = 0; i < (n/2);i++) {
            for(int j=i; j < ((n-i)-1); j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[(n-1) - j][i];
                matrix[(n-1) - j][i] = matrix[(n-1) - i][(n-1) - j];
                matrix[(n-1) - i][(n-1) - j] = matrix[j][(n-1) - i];
                matrix[j][(n-1) - i] = temp;
            }

        }
        return matrix;
    }

}
