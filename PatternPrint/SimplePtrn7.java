package Java.PatternPrint;

import java.util.Scanner;

public class SimplePtrn7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = s.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j =1 ; j<=i; j++){
                System.out.print(j);
            }for(int j =n*2-i*2; j>=1; j--){
                System.out.print(" ");
            }for(int j =i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
