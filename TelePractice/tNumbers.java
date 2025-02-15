package Java.TelePractice;

import java.util.Scanner;

public class tNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int t = sc.nextInt();
        System.out.println("Enter t numbers of number one by one : ");
        for(int i =1; i<= t; i++){
            int num = sc.nextInt();
            if(num%2==0){
                System.out.println(num+" is even");
            }else{
                System.out.println(num+" is odd");
            }
        }
        sc.close();
    }
}
