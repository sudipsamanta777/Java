package Java.PatternPrint;

import java.util.Scanner;

public class SimplePtrn4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a n : ");
        int n = s.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1 ; j <= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        /* Alternative Way........

        for(int i = n; i >= 1; i--){
            for(int j = 1 ; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

         */
    }
}
