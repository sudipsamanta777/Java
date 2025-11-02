package Java.SortingAlgo;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr, int n){
        for(int i =0; i<n; i++){
            for(int j = 0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 5, 62, 3, 18, 10, 45};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
