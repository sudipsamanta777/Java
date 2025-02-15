package Java.Array;

import java.util.HashMap;

public class ArrEleCount {
    public static void main(String[] args) {
//        int [] arr = {2,5,10,10,2,5,5,4,2,2};

//        for(int i =0; i<arr.length; i++){
//            int count = 1;
//            boolean counted = false;
//            for (int j =i+1; j< arr.length; j++){
//
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//                counted = true;
////                System.out.printf("%d : %d", arr[i], count);
//            }
//            if(counted) {
//                System.out.printf("%d : %d", arr[i], count);
//
//            }
//            System.out.println();
//        }
        String s = "wzdwzdwzxzw";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        int odd = 0;
        int even = 0;
        int maxDiff = Integer.MIN_VALUE;
        for (int i =0; i<s.length(); i++){
            if(map.get(s.charAt(i))%2==0){
                even = map.get(s.charAt(i));
            }
            else if(map.get(s.charAt(i))%2 != 0){
                odd = map.get(s.charAt(i));
            }
            if(even !=0 && odd !=0) {
                int diff = odd - even;
                maxDiff = Math.max(maxDiff, diff);
            }
        }
        System.out.println(map);
        System.out.println(odd);
        System.out.println(even);
        System.out.println(maxDiff);
    }
}
