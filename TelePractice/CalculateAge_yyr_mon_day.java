package Java.TelePractice;

import java.util.Scanner;

public class CalculateAge_yyr_mon_day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of days he lives : ");
        int days = sc.nextInt();
        int yr = days/365;
        int mon = (days-(yr*365))/30;
        int day = days-(yr*365)-(mon*30);
        System.out.println("Age: "+yr+" years : "+mon+" Months : "+day+" days");
    }
}
