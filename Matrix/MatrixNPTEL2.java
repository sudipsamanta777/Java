package Java.Matrix;

import java.util.Scanner;

public class MatrixNPTEL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cols = 5;
        int rows = 5;

        char[][] arr = new char[rows][cols];

// Input 5x5 2D Array using Scanner Class
        for(int i =0; i<rows; i++){
            String line = sc.next();
            for(int j =0; j<cols; j++){
                arr[i][j] = line.charAt(j);
            }
        }

// Perform the reflection operation
        for(int i  =0; i<rows; i++){
            int left = 0; int right = cols-1;
            while(left < right){
                char temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }

// Output 5x5 2D Reflection Array
        for(int i =0; i<rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(arr[i][j]);
            }
            if(i < rows-1){
                System.out.println();
            }
        }

    }
}
