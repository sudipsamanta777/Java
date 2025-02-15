package Java.TelePractice;

import java.util.Scanner;

public class ChckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num > 30){
            System.out.println("I am creating list");
        } else if (num < 30 && num > 20) {
            System.out.println("just joking");
        } else if (num > 7 && num < 20) {
            System.out.println("hello world");
        } else if (num < 7) {
            System.out.println("arghhh, this is annoying");
        }
    }
}
