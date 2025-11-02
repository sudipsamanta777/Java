package Java.Array;

//import java.util.*;

public class DuplicatesNumbersXOR {
    public static int duplicateNumbersXOR(int[] nums) {
        int res = 0;
//        int n= nums.length;
        /*
        Brute Force Approach -----------------------------------

        for(int i = 0; i < n; i++){
            int count = 1;
            for(int j = i+1; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 2){
                res ^= nums[i];
            }
        }
        return res;

         */

        // Better Approach ----------------------------
        /*
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                res ^= num;
            }
            set.add(num);
        }
        System.out.println(set);
        return res;

         */
        // Best Approach---------------------------
        boolean[] seen = new boolean[51];
        for(int num : nums){
            // if already seen this number then perform XOR operation and store result on res var
            if(seen[num]){
                res ^= num;
            }
            // if not seen before then perform this
            seen[num] = true;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        System.out.println(duplicateNumbersXOR(nums));

    }
}
