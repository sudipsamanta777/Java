package Java.TelePractice;

import java.util.Scanner;

public class FizBuzzEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int nu = sc.nextInt();
        if(nu%3==0 && nu%5==0){
            System.out.println("FizzBuzz");
        } else if (nu%3 == 0) {
            System.out.println("Fizz");
        } else if (nu % 5 == 0) {
            System.out.println("Buzz");
        }
    }
}
