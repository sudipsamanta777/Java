package Java.Array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumII {
    public static int singleNumber(int[] nums) {
//        int n = nums.length;
//        int res = 0;
        /*
        // Brute Force Approach-------------------
        for (int j : nums) {
            int count = 0;
            for (int num : nums) {
                if (j == num) {
                    count++;
                }
            }
            if (count == 1) {
                res = j;
            }
        }
        return res;
         */

        // Better Approach ------------
        /*
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }
//        System.out.println(map);
        for(int num : nums){
            if(map.get(num) == 1){
                res = num;
            }
        }
        return res;
         */

        // best Approach -----------------------
        int ones = 0, twos = 0;
        for(int num : nums){
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
        /*
          ones ^= num: toggles bits where num has a 1 (like counting mod 2).

          & ~twos: clears bits that are already in twos (i.e., appeared twice).

           Similarly for twos, we use updated ones to maintain correct state.
        */
    }
    public static void main(String[] args) {
        int [] nums = {0,1,0,1,0,1,99};
        System.out.println((singleNumber(nums)));
    }
}
