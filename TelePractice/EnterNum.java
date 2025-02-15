package Java.TelePractice;

import java.util.Scanner;

public class EnterNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int num1 = 0;
        int count =0;
        while(num < 43){
            System.out.println("Enter the number again :");
            num = sc.nextInt();
        }
        for(int i =1; i<= num/2; i++){
            if(num%i == 0){
                count++;
            }
        }
        System.out.println("Total number of factors : "+ count);
        if(count%2 ==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
