package Java.TelePractice;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter "+len+" elements : ");
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
