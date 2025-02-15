package Java.Array;
//
//import java.io.*;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.StringReader;
//import java.util.Scanner;
//
//public class EFindDuplicateEl {
//    public static void main(String[] args) throws IOException{
//
//        int[] arr = {1, 1, 2, 1, 1};
//        int n = arr.length;
//        int ele = 0;
//        for(int i =0; i < n; i++){
//            if(ele == arr[i]){
//                System.out.println(ele);
//            }
//            ele = arr[i];
//        }
//
//    }
//}





import java.util.*;

public class EFindDuplicateEl {
    public static List<Integer> findDuplicates(int[] arr) {
        // Using a HashSet to track duplicates
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            // If the number is already in seen, add it to duplicates
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        // Convert the duplicates set to a sorted list
        List<Integer> result = new ArrayList<>(duplicates);
        Collections.sort(result);

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {2, 3, 1, 2, 3};
        System.out.println(findDuplicates(arr1));  // Output: [2, 3]

        // Example 2
        int[] arr2 = {0, 3, 1, 2};
        System.out.println(findDuplicates(arr2));  // Output: []

        // Example 3
        int[] arr3 = {2};
        System.out.println(findDuplicates(arr3));  // Output: []
    }
}
