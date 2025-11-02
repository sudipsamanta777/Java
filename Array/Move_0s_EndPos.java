package Java.Array;

import java.util.Arrays;

public class Move_0s_EndPos {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int n = arr.length;

        // Pointer to track the position for next non-zero element
        int count = 0;
        for(int i =0; i<n-1; i++){
            if(arr[i] !=0){     // If the current element is non-zero

                // Swap the current element with the 0 at index 'count'
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                // Move 'count' pointer to the next position
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
