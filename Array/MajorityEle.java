package Java.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MajorityEle {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
//            map.put(num, map.getOrDefault(num,0)+1);// inbuilt method
//            if(map.get(num) > n/3){
//                System.out.println(num);
//                break;
//            }
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }

        }
        for(int num : nums){
            if(map.get(num) > n/3){
                set.add(num);
//                break;
            }
        }
        System.out.println(set);
    }
}
