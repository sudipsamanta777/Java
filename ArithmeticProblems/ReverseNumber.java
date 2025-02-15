package Java.ArithmeticProblems;

import java.util.Scanner;

public class ReverseNumber {
    /*
    Take a number from the user as input and print the reversed number.
     Example :  Input : 1234
	     Output : 4321

     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = s.nextInt();
        String str = Integer.toString(num);
        int n = str.length();
        int rev = 0;
        for(int i=0; i< n; i++){
            rev = num%10;
            num = num/10;
            System.out.print(rev);
        }
    }
}
