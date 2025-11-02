package Java.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import static java.lang.System.out;

public class Remove_duplicates {
    public  static int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : nums){
            if(!list.contains(i)){
                list.add(i);
            }
        }
        for (int j =0; j<list.size(); j++){
            nums[j] = list.get(j);
        }
        return list.size();

    }



    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
        try {
            System.out.println(3/0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage().replace("/","Division"));
        }
    }
}
