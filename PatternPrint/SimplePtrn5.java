package Java.PatternPrint;

import java.util.Scanner;

public class SimplePtrn5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n = s.nextInt();
        for(int i =1; i<=n ; i++){ // 1st loop for rows...

            for(int j =1 ; j<= n-i; j++){ // nested 1st loop for printing spaces...
                System.out.print(" ");
            }

            for(int j = 1; j<=2*i-1; j++){ // 2nd nested loop for printing stars...
                System.out.print("*");
            }

            for(int j =1 ; j<= n-i; j++){ // nested 3rd loop for printing  spaces column wise after stars...
                System.out.print(" ");
            }
            System.out.println(); // for going to next line....

            /*
            for(int j =1 ; j< i; j++){
                System.out.print("* ");
            }
            System.out.println();

             */
        }
    }
}
