package Java.TelePractice;

import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Years for age : ");
        int yr = sc.nextInt();
        System.out.println("Enter Months for age : ");
        int mn = sc.nextInt();
        int age = (yr*365)+(mn*30);
        System.out.println("Age: "+ age+" days");
    }
}
