package Java.TelePractice;

import java.util.Scanner;

public class PrintingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (t) : ");
        int t = sc.nextInt();
        for(int i =1; i<=t; i++){
            int num ;
            do{
                System.out.println("Enter number"+i+" :");
                num = sc.nextInt();
                if(num<0){
                    System.out.println("sahi se number daba keya kar raha hai yrr.. ");
                }
            }while(num < 0);
            String num1 = Integer.toString(num);
            for(int j =1; j<= num1.length(); j++){

            }
        }
    }
}
