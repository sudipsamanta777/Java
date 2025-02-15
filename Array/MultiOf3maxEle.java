package Java.Array;

import java.awt.*;
import java.util.*;
import java.util.List;

public class MultiOf3maxEle {
    public static void main(String[] args) {
        int[] arr = {10, -3, -5, -6, -20, -20, 30, 10};
        int n = arr.length;
//        rotateArray(arr, 0, 4);
        List<Integer> res = new ArrayList<>();
        for(int i : arr){
            res.add(i);
        }
//        Collections.sort(res);

        Set<Integer> set = new TreeSet<>(res);
        List<Integer> res1 = new ArrayList<>(set);

        int[] array = res1.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(array));

        System.out.println(res1);
//        System.out.println(res.get(0));


    }
    static void rotateArray(int [] arr, int left, int right){
        for(int i =left; i<right; i++){
            int temp = arr[i];
            arr[i] = arr[right];
            arr[right] = temp;
            right--;


        }
    }
}
