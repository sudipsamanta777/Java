package Java.ArithmeticProblems;

import java.util.Scanner;
/*
Take a number from the user as input and check if it is an Armstrong number or not.
 */

public class ArmstrongNumCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = s.nextInt();
        int num1 = num;
        String str = Integer.toString(num);
        int len = str.length();
        int i =0;
        int sum = 0;
        while(i<num){
            sum += Math.pow((num%10),len);
            num = num/10;
        }
        if(sum == num1 ){
            System.out.println("Armstrong");
        }
        System.out.print(sum);

    }
}
