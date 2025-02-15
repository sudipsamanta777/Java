package Java.TelePractice;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int numDup = num;
        String nums = Integer.toString(num);
        int rev = 0;
        for(int i =1; i<=nums.length(); i++){
            int rem = num%10;
            num/=10;
            rev = rem + rev*10;
        }
//        System.out.println(rev);
        if(rev == numDup){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
