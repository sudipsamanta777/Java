package Java.SortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    static  void selectionSort(int[] arr, int n){
        for(int i = 0; i<n-1; i++){
            int minIdx = i;
            for(int j = i+1; j< n; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

    }

    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 5, 62, 3, 18, 10, 45};
        selectionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
