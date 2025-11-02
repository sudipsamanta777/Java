package Java.Array;

import java.util.HashMap;

public class ArrEleCount {
    public static void main(String[] args) {
        int [] arr = {2,5,11,10,10,5,2,5,5,4,4,5};

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
        int heighestFreq = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int lowestFreq = map.get(2);
        System.out.println(map);
        for(int i=0; i< map.size(); i++){
            if(map.get(arr[i])>heighestFreq) {
                heighestFreq = map.get(arr[i]);
            }
            if(map.get(arr[i])< lowestFreq){
                lowestFreq = map.get(arr[i]);
            }
        }
        System.out.println(heighestFreq);
        System.out.println(lowestFreq);


    }
}
