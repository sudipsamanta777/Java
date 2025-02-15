package Java.TelePractice;

import java.util.Scanner;

public class BinaryForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int binary ;
        System.out.print("Binary form of "+num+ " : ");
        while(num > 0){
            binary = num%2;
            num /= 2;
            System.out.print(binary);
        }
        sc.close();
    }
}
