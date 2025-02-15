package Java.PatternPrint;

import java.util.Scanner;

public class SimplePtrn9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = s.nextInt();

        for(int i =0 ; i<=n; i++){
            for(int  j =1 ; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j =1 ; j<=2*i-1; j++){
                System.out.print("*");
            }
            for(int  j =1 ; j<= n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i =0 ; i<=n; i++){
            for(int  j =1 ; j<= i; j++){
                System.out.print(" ");
            }
            for(int j =2*n-2*i ; j>1; j--){
                System.out.print("*");
            }
            for(int  j =1 ; j<= i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
