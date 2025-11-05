package Java.SortingAlgo;

import java.util.Arrays;

public class QuickSort {
    static  int partition(int[] arr, int low, int high){
        // using while loop
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j) {
            while(arr[i] <= pivot && i <= high-1) {
                i++;
            }

            while(arr[j] > pivot && j >= low+1) {
                j--;
            }

            if(i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;

        // using for loop
        /*
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return  i+1;
        */
    }
    static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 5, 62, 3, 18, 10, 45};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
