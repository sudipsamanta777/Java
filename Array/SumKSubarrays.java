package Java.Array;

import java.util.Arrays;

/*
Homework question solve - For a given array, find the total number of subarrays with sum "k".
 */
public class SumKSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1};
        int k = 3;
        int count =0;
        String s = "42";



        // Naive Approach -------------------

        for(int i=0; i<arr.length; i++){
            int sum =0;
            for(int j =i; j<arr.length; j++){
                sum+=arr[j];
                if(sum == k){
                    count++; // this is for total subarrays..
//                    count = Math.max(count, (j-i)+1 );
                }
            }

        }
        System.out.println(count);
        System.out.println(s.charAt(0)-'0');

    }
}
