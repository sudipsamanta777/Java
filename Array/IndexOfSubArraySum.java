package Java.Array;

import java.math.BigInteger;
import java.util.Arrays;

public class IndexOfSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        String s = "I love foot";
        int n = arr.length;
        int sum =0;
        int j = 0;
        int target = 12;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            while(sum > target && j <= i ){
                sum -= arr[j];
                j++;
            }
            if(sum == target){
                int[] a = {j+1, i+1};
                System.out.println(Arrays.toString(a));
            }

        }
        System.out.println(Arrays.toString(new int[]{-1}));
        //System.out.println(sum);

    }
}
