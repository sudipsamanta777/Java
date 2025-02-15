package Java.TelePractice;

import java.util.Scanner;

public class ArmstrongNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        while(num < 0){
            System.out.println("Neend mein hai keya!");
            System.out.println("Reenter please : ");
            num = sc.nextInt();
        }
        String nums = Integer.toString(num);
        int sum = 0;
        for(int i =1; i<= nums.length(); i++){
            int remainder = num%10;
            num /= 10;
            sum += Math.pow((double) remainder, (double) nums.length());
        }
        System.out.println(sum);
        if(num == sum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("not armstrong");
        }
    }
}
