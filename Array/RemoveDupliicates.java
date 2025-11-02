package Java.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDupliicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 3,4,4,4};
        int n = nums.length;

        /* Naive Approach (Using Arraylist or u can use HashSet)----------
        int[] arr = new int[n];

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : nums) { // traverse the whole array
            if (!list.contains(i)) { // check if list is not contains same elements then add the elemwnt in list..
                list.add(i); //adding unique elements in the list
            }
        }
        for (int j = 0; j < list.size(); j++) { // traverse the lists and store all element in array
            arr[j] = list.get(j);//non-descending order ..
        }

        System.out.println(Arrays.toString(arr));
        // output - [1, 2, 3, 0, 0, 0, 0]


         */


        // Optimization Approach-------------
        // (Using two operators) -----



        int i =0;
        for(int j =1; j<n-1; j++){ // storing unique element non-descending order..
            if(nums[i] == nums[j]){ // if ture then it skip the loop and go for next iteration
                continue;
            }
            else{ // if unique element found then swapped it to last previous same element
                i++; // it points to iterator for unique element to store one by one
                swap(i,j,nums); // swap the last same element and another unique element
            }
        }
        for(int j = i+1; j< n; j++){ // set the remaining elements -1..
            nums[j] = -1;
        }
        System.out.println(Arrays.toString(nums));


    }

    // Function to swap two elements..
    static void swap(int l, int r, int[] arr){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }


}
