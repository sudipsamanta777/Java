package Java.Array;

import java.util.Scanner;

public class EFindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int  n = sc.nextInt();

        int [] arr = {1,2,3,5};
        int sum_of_n_terms = (n*(n+1)) / 2;
        int sum_of_arr_ele = 0;
        for(int i = 0 ; i< arr.length; i++){
            sum_of_arr_ele += arr[i];
        }
        int res = sum_of_n_terms - sum_of_arr_ele;
        System.out.println("Missing Number : "+res);

    }
}
