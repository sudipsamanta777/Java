package Java.ArithmeticProblems;

import java.util.Scanner;
/*
Take 2 numbers from the user as input and find the Java.ArithmeticProblems.GCD of them.
 */

public class GCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = s.nextInt();
        System.out.println("Enter number2: ");
        int num2 = s.nextInt();
        int i =1;
        int GCD =0;
        while(i<=num1){
            if(num1%i==0 && num2%i==0){
               GCD = i;
            }
            i++;
        }
        System.out.println("Greatest Common Factor(Java.ArithmeticProblems.GCD) is: "+GCD);
    }
}
