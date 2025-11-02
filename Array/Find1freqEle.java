package Java.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Find1freqEle {
    public static void main(String[] args) {

        // there are 3 approach...

        // Approach 1 (Efficient)(Using XOR operator)...

        int[] arr = {6,5,6,3,5,3,1,2,1};
     /*   int sum =0;

        for(int i =0; i<arr.length; i++){
            sum ^= arr[i];
        }
        System.out.println(sum);

      */

        // Approach -2 (Using Hashmap)..

/*
        HashMap<Integer, Integer> map = new HashMap<>(); // Creates a hashMap

        for(int i =0; i< arr.length; i++){  // loop for find the frequency of all element ..

            if(map.containsKey(arr[i])){ // check if map is already contains element
                map.put(arr[i], map.get(arr[i])+1 ); // increase the frequency by 1
            }else{
                map.put(arr[i], 1); // if not contains then initialize the frequency of element 1
            }
        }
        for(int i=0 ; i < arr.length; i++){
            if(map.get(arr[i])==1){ // check which element contains frequency 1 .
                System.out.println(arr[i]); // print the element..
            }
        }

 */

        // Approach -- 3 (Naive solution)..
        // using two loops..

        for(int i =0; i<arr.length; i++){ // hold the loop

            for(int j =i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){ // an element which is already in the array if
                    arr[i] = -1; // change the element into -1
                    arr[j] = -1; // and it's another  copy also change as -1
                }
            }
            if(arr[i] != -1){ // if an element is not change into -1
                System.out.println(arr[i]); // print that element..
            }
        }
        System.out.println(Arrays.toString(arr));







    }
}


