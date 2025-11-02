package Java.Matrix;

import java.util.Scanner;
/*
Write suitable code to develop a 2D Flip-Flop Array with dimension 5 × 5, which replaces all input elements with values 0 by 1 and 1 by 0. An example is shown below:

INPUT:
               00001
               00001
               00001
               00001
               00001

OUTPUT:

               11110
               11110
               11110
               11110
               11110

 */

public class MatrixNPTEL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declare the 5X5 2D array to store the input
        int[][] arr = new int[5][5];

        // Input 2D Array using Scanner Class and check data validity

        System.out.println("Enter elements : " );
        for (int i = 0; i < 5; i++) {
            String line = sc.next(); // Read as string
            for (int j = 0; j < 5; j++) {
                arr[i][j] = line.charAt(j) - '0'; // Convert character to integer
            }
        }


        // Perform the Flip-Flop Operation

        for(int i =0; i<5; i++){
            for(int j =0; j<5; j++){
                if(arr[i][j] == 1){ // if element found as 1 convert it 0
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = 1; // other than convert it into 1
                }
            }
        }

        // Output the 2D Flip-Flop Array

        System.out.println("FlipFlop 2D array : ");
        for(int i =0; i<5; i++){
            for(int j =0; j<5; j++){
                System.out.print(arr[i][j]); // printing every columns elements
            }
            if(i < 4) {
                System.out.println(); // for new line except last row
            }
        }
    }
}
