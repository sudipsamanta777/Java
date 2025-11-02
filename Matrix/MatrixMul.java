package Java.Matrix;

import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating an object of Scanner class

        System.out.println("Enter 1st matrix's row : ");
        int row1 = sc.nextInt();
        System.out.println("Enter 1st matrix's col : ");
        int col1 = sc.nextInt();
        System.out.println("Enter 2nd matrix's row : ");
        int row2 = sc.nextInt();
        System.out.println("Enter 2nd matrix's col : ");
        int col2 = sc.nextInt();
        int[][] mat1 = new int[row1][col1];  // row2 == col1
        int[][] mat2 = new int[row2][col2];
        if(col1 == row2) {
            System.out.println("Enter 1st matrix's elements : ");
            // taking input from user for 1st matrix
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    mat1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter 2nd matrix's elements: ");
            // taking input from user for 2nd matrix

            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    mat2[i][j] = sc.nextInt();
                }
            }
            // Matrix  multiplication process-------------

            int[][] result = new int[row1][col2];
            for (int i = 0; i < row1; i++) { // for row of result
                for (int j = 0; j < col2; j++) { // for column of result
                    for (int k = 0; k < col1; k++) {
                        result[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }

            // printing all elements of result Matrix

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// indiaBix for aptitude
