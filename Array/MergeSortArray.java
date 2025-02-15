package Java.Array;

import java.util.Arrays;

public class MergeSortArray {
    public static void main(String[] args) {
        int[] num1 = {0};
        int[] num2 = {1};
       int m =0;
        int n =1;
        int j =0;
        for(int i =m; i<m+n; i++){
            num1[i] = num2[j];
            j++;
        }
        Arrays.sort(num1);
        System.out.println(Arrays.toString(num1));
    }
}
