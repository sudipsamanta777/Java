package Java.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Union_or_Interection {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // add your code here
        HashSet<Integer> list = new HashSet<>(); // Duplicates are only store one time in this list...
        for(int num : a){
            list.add(num);
        }
        for(int num: b){
            list.add(num);
        }
//        return list;
        ArrayList<Integer> arrlis = new ArrayList<>(list);
        Collections.sort(arrlis);
        return  arrlis;
    }

    public static void main(String[] args) {
        int[] a = {-2, -2, 3, 4, -5};
        int[] b = {1, 1, 2, 3, 4};
        System.out.println(findUnion(a, b));
    }


}
