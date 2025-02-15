package Java.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class EReverseArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] a){
        int n = a.length;
        int i = 0 ;
        int j = n-1;
        while(i < j){
            int temp = a[i]; //taking a temporary variable temp where we store first left side elements
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
//        for(int i =0; i<n; i++){
//            int temp = a[i];
//            a[i] = a[n-1];
//            a[n-1] = temp;
//            n -= 1;
//        }
    }
}
