package Java.Array;

import java.util.HashSet;

/*
Check if the given array has a subarray having sum 0

hint - use prefix sum technique - add all elements upto ith element"
 */
public class SubArraySum0 {
    public static void main(String[] args) {
        int[] arr = {4,2,-3,1,6};
        int sum =0;
//        Bishal Daa's Approach--------

        for(int i =0 ; i<arr.length; i++){
            sum = 0;
            sum += arr[i];
            if(sum ==0){
                System.out.println(true);
                break;
            }
            for (int j =i+1; j<arr.length; j++){
                sum += arr[j];
                if(sum==0){
                    System.out.println(true);
                    break;
                }
            }
        }



         //Another Approach ----
         //using Hashset<>.....

        /*HashSet<Integer> set = new HashSet<>();
        for (int i : arr){
            sum += i;
            if(sum == 0){
                System.out.println(true);
                break;
            }
            if(set.contains(sum)){
                System.out.println(true);
                break;
            }
            set.add(sum);
        }

         */
    }
}
