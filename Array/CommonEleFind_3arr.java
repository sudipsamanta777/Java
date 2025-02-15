package Java.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CommonEleFind_3arr {
    public static  List<Integer> commonElements(int[] arr1, int[] arr2,
                                        int[] arr3) {
        // Code Here
        HashSet<Integer> set = new HashSet<>();
        boolean present = false;
       for(int i : arr1){
           for(int j : arr2){
               for(int k :arr3){
                   if(i == j && j==k){
                       set.add(i);
                       present = true;
                   }
               }
           }
       }
       if(!present){
           set.add(-1);
       }
       List<Integer> res = new ArrayList<>(set);
       Collections.sort(res);
       return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 ={6, 7};
        int[] arr3 ={8,9,10,11};
        System.out.println(commonElements(arr1, arr2, arr3));
    }
}
