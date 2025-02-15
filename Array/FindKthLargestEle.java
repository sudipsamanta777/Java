package Java.Array;

import java.util.Arrays;

public class FindKthLargestEle {
    public static void main(String[] args) {
        int [] arr = {3,4,5,6,1,7,9,8,10};
        int n = arr.length;
        boolean swapped;
        // Sorting the array...
        for(int i=0; i<n; i++){
            swapped = false;
            // swapping the adjacent element if we found a small element..
            for(int j=0; j<n-1-i; j++){
                if(arr[j] >= arr[j+1]){ // condition to check element in j position is bigger than element in j+i pos..
                    int temp = arr[j]; // store the element in temp for swapping
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break; // breaking the loop if swapped are completed..
        }
        System.out.println(Arrays.toString(arr));
        int k =4;
        int KthELe = arr[n-k];
        System.out.println(KthELe);

    }
}
