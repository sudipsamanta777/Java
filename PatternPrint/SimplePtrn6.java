package Java.PatternPrint;

import java.util.Scanner;

public class SimplePtrn6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = s.nextInt();

        for(int i =1; i<=n; i++){
            for(int j = 1; j<i; j++){
                System.out.print(" ");
            }
//            for(int j = 2*n-2*i; j>=0; j--){
//                System.out.print("*");
//            }

            for(int j =1 ; j<= 2*n-2*i+1; j++){
                System.out.print("*");
            }

            for(int j = 1; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
