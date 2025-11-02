package Java.Array;

public class MaxConsequtive {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0};
        int count = 1;
        int maxC = 1;
        int n = arr.length;
        for(int i =0; i<n-1; i++){
            if(arr[i] == arr[i+1]){ // check for equal elements
                count++; // and increase the count by one
            }else { // if not found
                count =1;  // then incialize the count 1
            }
            if(count > maxC){ // finding maxcount of an element
                maxC = count; // update the max count
            }
        }
        System.out.println(maxC);

    }
}
