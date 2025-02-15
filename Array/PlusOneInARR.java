package Java.Array;

import java.util.Arrays;

class PlusOneInARR {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i =len-1; i>=0 ; i--){ // traverse last index to 0th index..
            if(digits[i] < 9){ // if last element is less than 9 then add 1 to this number
                digits[i]++; // increasing by one
                return digits; // then return this array.
            }
            // if element is equal to 9 then set the element to 0
            digits[i] = 0;
        }
        // if all element are 9 then create an array that's length will be plus one..
        int[] arr = new int[len+1];
        arr[0] = 1; // set arrays 1st element 1.
        return  arr; // if all elements are 9 then return this array

    }

    public static void main(String[] args) {
        int [] arr = {9,9,9};
        int [] arr2 = {1,2,3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}