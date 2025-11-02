package Java.Array;


public class SingleNum {
    public static int singleNumber(int[] nums) {
        int res = 0;
        /*  Brute Force Approach
        int n = nums.length;
        for(int i = 0; i<n; i++ ){
            int count = 0;
            for(int j = 0; j<n; j++){
                if( nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                return nums[i];
            }
        }*/

        // best Approach -----------------------
        for(int num : nums){
            res ^= num;
        }
        return res;
    }

    public static void main(String[] args) {
        int [] nums = {4, 1, 2, 1, 2};
        System.out.println((singleNumber(nums)));
    }
}
