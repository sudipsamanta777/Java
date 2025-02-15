package Java.TelePractice;

import java.util.Scanner;

public class ConvertHr_MinToSec {
    static int ConSec(int hr, int min){
        int sec = (hr*3600)+(min*60);
        return sec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of hours: ");
        int hr = sc.nextInt();
        System.out.println("Enter no. of mins: ");
        int min = sc.nextInt();
        int sec = ConSec(hr, min);
        System.out.println("no. of seconds : "+ sec);
    }
}
