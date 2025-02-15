package Java.Array;
import java.util.*;

public class Esubsequence {
    public List<Integer> find3Numbers(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        if (n < 3) return result; // Return an empty list if not enough elements

        // Create arrays to hold the minimum and maximum values
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        // Fill the leftMin array
        leftMin[0] = Integer.MAX_VALUE; // Nothing to the left of the first element
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], arr[i - 1]);
        }

        // Fill the rightMax array
        rightMax[n - 1] = Integer.MIN_VALUE; // Nothing to the right of the last element
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i + 1]);
        }

        // Now, check if there is a valid triplet
        for (int j = 1; j < n - 1; j++) {
            if (leftMin[j] < arr[j] && arr[j] < rightMax[j]) {
                result.add(leftMin[j]); // Adding the first element of the triplet
                result.add(arr[j]);      // Adding the middle element of the triplet
                result.add(rightMax[j]); // Adding the last element of the triplet
                return result;           // Return the triplet found
            }
        }

        return result; // Return an empty list if no triplet is found
    }

    public static void main(String[] args) {
        Esubsequence finder = new Esubsequence();
        System.out.println(finder.find3Numbers(new int[]{1, 2, 1, 1, 3})); // Output: [1, 2, 3]
        System.out.println(finder.find3Numbers(new int[]{1, 1, 3}));       // Output: []
    }
}
