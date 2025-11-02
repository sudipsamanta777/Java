package Java.Array;

import java.util.Arrays;
import java.util.Vector;

public class AddOne {
    public static void main(String[] args) {
        int[] arr = {9,9,9};

        int n = arr.length;
        Vector<Integer> vec = new Vector<>();
        for(int i =0; i<n; i++){
            vec.add(arr[i]);
        }
        int n1 = vec.size();
//        System.out.println(n1);
        for (int i =n1-1 ; i>=0; i--){
            if(vec.get(i) < 9){
                vec.set(i, vec.get(i)+1);
                break;
            }
            vec.set(i, 0);
        }
        vec.insertElementAt(1,0);
        System.out.println(vec);
    }
}
