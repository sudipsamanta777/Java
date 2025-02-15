package Java.Array;

import java.util.Arrays;

public class EBubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,3,5,3,8,9,1,2};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void BubbleSort(int[] arr){
        int n = arr.length;
        boolean swaped;
        for(int i = 0 ; i<n; i++){
            swaped = false;
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] >= arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaped = true;
                }
            }
            if(!swaped) break;
        }
    }
}
