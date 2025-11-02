package Java.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class RverseArraIngrp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayList<Long> list = new ArrayList<>();
        for(int i : arr){
            list.add((long)i);
        }
        System.out.println(list);
        int k = 5;
        int n= list.size();
        for(int i =0; i<n; i+=k){
            int left = i;
            int right = Math.min(i+k-1, n-1);
            reverseAr(left, right, list);
        }
        System.out.println(list);
    }
    static  void reverseAr(int left, int right , ArrayList<Long> arr){
        while(left < right){
            long temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left++;
            right--;

        }
    }
}
