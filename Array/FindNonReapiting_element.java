package Java.Array;

import java.util.HashMap;

public class FindNonReapiting_element {
    static  int firstNonRepeating(int[] arr) {
        // Step 1: Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count frequencies of elements
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the first non-repeating element
        for (int num : arr) {
            if (freqMap.get(num) == 1) {
                return num;
            }
        }


        // Step 3: If no non-repeating element is found, return 0
        return 0;
    }

    public static void main(String[] args) {
            // Example usage
            int[] arr1 = {-1, 2, -1, 3, 2};
            System.out.println(firstNonRepeating(arr1));  // Output: 3

            int[] arr2 = {1, 1, 1};
            System.out.println(firstNonRepeating(arr2));  // Output: 0
    }

}
