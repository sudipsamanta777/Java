package Java.TelePractice;

import java.util.Scanner;

public class TableOfANumber {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = ac.nextInt();
        for(int i =1; i<=10; i++){
            System.out.printf("%d * %d = %d \n", num, i, (num*i));
        }
    }
}
