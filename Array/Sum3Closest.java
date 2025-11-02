package Java.Array;

import java.util.Arrays;

public class Sum3Closest {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int target = 1;
        System.out.println(threeSumClosest(arr, target));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];

        // Brute Force Approach------------------
        /*

        for(int i = 0; i < n - 2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j +1; k < n; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(Math.abs(sum - target) < Math.abs(closestSum - target)){
                        closestSum = sum;
                    }
                    if(sum == target){
                        return sum;
                    }
                }
            }
        }
        return closestSum;

         */
        for(int i = 0; i < n-2; i++){
            int left = i+1, right = n-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(sum - target) < Math.abs(closestSum - target)){
                    closestSum = sum;
                }

                if(sum < target){
                    left++;
                }else if(sum > target){
                    right--;
                }else{
                    return sum;
                }
            }
        }
        return closestSum;
    }
}
