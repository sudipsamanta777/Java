package Java.ArithmeticProblems;

import java.util.Scanner;

/*
"Write a program to take a positive number from the user and find the digit root of the number. The digit root of a number is obtained by repeatedly summing its digits until a single-digit number is obtained.

Input: N = 9875
Output: 2
Explanation: 9+8+7+5 = 29, 2+9 = 11, 1+1=2"
 */
public class RootNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        // first operation..
        // if number is negative then prompt the user to enter number again until he enters a positive number
        while(num < 0){
            System.out.println("Enter number again : ");
            num = sc.nextInt();
        }

        //second operation...

        while(num >= 10){ // check the number if it is equal or greater than 10 the enters the loop and perform operation..
            int sum =0; // creating a sum var and assign 0
            while(num > 0) {
                sum += num % 10; // increase the sum eventually with each digit of num
                num /= 10; // decreasing the size of num by one..
            }
            num = sum; // assign sum with num to check 1st while condition for going to out of the loop ..
        }
        System.out.println(num);

        // No relations  between these programs.......

        /*
        find outing the current year.....

         */

        java.util.Calendar current;

        current = java.util.Calendar.getInstance(); // fetch the current time ....
        System.out.println(current.getWeekYear()); // function to get the current week year..


    }
}
