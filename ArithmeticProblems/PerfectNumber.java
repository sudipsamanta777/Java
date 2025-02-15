package Java.ArithmeticProblems;

import java.util.Scanner;

public class PerfectNumber {
    /*
     Take a number from the user and check if it is a perfect number or not.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for checking perfect: ");
        int num = s.nextInt();
        int sum =0;
        for(int i =1; i<num; i++){
            if(num%i == 0){
                sum += i;
            }
        }if(sum == num){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect");
        }
    }
}
