package Java.SortingAlgo;

import java.util.Arrays;

public class InsertionSort {
    static  void insertionSort(int[] arr, int n){
        for(int i =1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;

        }
    }

    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 5, 62, 3, 18, 10, 45};
        insertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
