package Java.ArithmeticProblems;

import java.util.Scanner;
/*
Take two numbers from user and find lest Common Multiple(LCM) of them...
 */
public class LCM_ofTwoNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = s.nextInt();
        System.out.println("Enter number2: ");
        int num2 = s.nextInt();
        int LCM = 0;
        for(int i =1; i<=10; i++){
            int num3 = num2*i;
            if(num3%num1==0){
                LCM = num3;
                break;
            }
        }System.out.println("Least Common Multiple(LCM) : "+LCM);
    }
}
