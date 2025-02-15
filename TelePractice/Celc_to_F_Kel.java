package Java.TelePractice;

import java.util.Arrays;
import java.util.Scanner;

public class Celc_to_F_Kel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // creating a new object using scanner class named sc
        System.out.println("Enter temperature in celsius(0<=cel<=1000) : "); // instruction for user to enter a double input as celsius
        double celsius = sc.nextDouble();  // taking an input from user


        double[] arr = new double[2]; // declare an array with datatype of double and initialize its size 2
        double kelvin = celsius +273.15; // convert temp in kelvin using this formula
        double fahrenheit = celsius * 1.80 + 32.00; // convert temp in fahrenheit using this formula
        // store these value in array--
        arr[0] = kelvin;
        arr[1] = fahrenheit;
        System.out.printf("Output : "+ Arrays.toString(arr)); // print the array as a string line
        sc.close(); // close the scanner input

    }
}
