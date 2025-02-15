package Java.TelePractice;

import java.util.Scanner;

public class ConvertSecToHr__min_sec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of sec: ");
        int numOfsec = sc.nextInt();

        int hr = numOfsec/3600;
        System.out.println("Hr: "+hr);
        int min = (numOfsec-(hr*3600))/60;
        System.out.println("Min: "+min);
        int sec = numOfsec-(hr*3600)-(min*60);
        System.out.println("Sec: "+sec);

    }
}
