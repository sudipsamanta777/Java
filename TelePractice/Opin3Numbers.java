package Java.TelePractice;

import java.util.Scanner;

public class Opin3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int num3 = sc.nextInt();
        if(num1 > num3){
            int add = num1+num2+num3;
            System.out.println("The addition : "+ add);
        } else if (num1 == num2) {
            num1 = num3;
            System.out.println("Keya struggle hai! ");
        }else{
            System.out.println("Question dhyan se  padho");
        }
    }
}
