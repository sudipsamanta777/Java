package Java.TelePractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InputArray2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // creating an object name in
        System.out.println("Enter the length : ");
        String n = in.readLine(); // taking a number string from user
        int len = Integer.parseInt(n); // convert the number string into an integer
        int[] arr = new int[len]; // declare an array with its size
        System.out.println("enter "+len+" elements : ");
        for(int i =0; i<len; i++){
            arr[i] =Integer.parseInt(in.readLine()); // take all elements one by one from user
        }
        System.out.println(Arrays.toString(arr)); // print the whole array as string
    }
}
