package Java.Array;

import java.util.Arrays;

/*
there are 4ways to solve this problem.

1. create 1 method, call it 'd' times
2. Do rotation part by part
3. create another array & put the elements of original array proper places.
 */
public class EarrRotate {


    public static void main(String[] args) {
        int [] arr = {1,3,4,2,7,9};
        int d = 2;

        //Approach-1

//        for(int i = 1 ; i<= d; i++){  // loop for rotate array d times ..
//            rotateArray(arr);
//        }
        // Printing the rotated array.....

        // Approach-2
        rotateArray(arr, d);

        System.out.println(Arrays.toString(arr));
    }

    // Approach 1---
    // Creating a method to rotate the array....

    /*
    public static void rotateArray(int [] arr){
        int temp = arr[0]; // store the first element in temp variable.
        for(int i = 1; i<arr.length; i++){
            arr[i-1]=arr[i]; // swaping the element in left side.
        }
        arr[arr.length-1]=temp; // swaping the 1st element in the last index of te array..
    }

     */

    // Approach 2-----
    public static void rotateArray(int[] a, int d){

        int n = a.length;
        d = d % n; // Handle cases where d>=n

        // reverse the whole array.
        reverse(a, 0, n-1);
        // reverse the first n-d element.
        reverse(a, 0, n-d-1);
        //reverse the element from n-d to n element.
        reverse(a, (n-d), (n-1));

    }
    public static void reverse(int[] a, int start, int end){ // create a method for reversing the array.
        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
