package Java.TelePractice;

import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Enter nationality : ");
        String na = sc.next();
        if(age >= 18 && na.equalsIgnoreCase("indian")){
            System.out.println("You can vote");
        } else if (age >= 18) {
            System.out.println("Bhag yaha se, dusre desh mein ja");
        } else if (age < 18) {
            System.out.println("abhi ghar jaa, bada ho ja, firr aana");
        }
    }
}
