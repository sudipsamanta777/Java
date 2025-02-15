package Java.TelePractice;

import java.util.Scanner;

public class SumOfNnaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int sum =0;
        if(n <= 0 ){
            System.out.println(" Please enter a positive number");
        }else {
            for (int i = 0; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
}
