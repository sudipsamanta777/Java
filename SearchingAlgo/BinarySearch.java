package Java.SearchingAlgo;

import java.util.Arrays;

public class BinarySearch {
    static  int binarySearch(int[] arr, int n, int key){
        int left = 0;
        int right = n-1;
        while(left <= right){
            int mid = left + (right - left )/ 2;
            if(arr[mid] == key){
//                System.out.println("Found the element by Binary Search");
                return mid;
            } else if (arr[mid] < key){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 5, 62, 3, 18, 10, 45};
        System.out.println(binarySearch(arr, arr.length, 62));
        System.out.println(Arrays.toString(arr));
    }
}
