package Java.Array;

public class MaxProductOfTriplet {
    public static void main(String[] args) {
        int[] arr = {1, -4, 3, -6, 7, 0};
        int maxMul = Integer.MIN_VALUE;
        int n = arr.length;
        /*

         Naive Approach.....

        for(int i=0; i< n-2; i++){
            for(int j =i+1; j< n-1; j++){
                for(int k = j+1; k<n; k++)
                {
                    maxMul = Math.max(maxMul,arr[i]*arr[j]*arr[k]);
                }
            }
        }
        */
        System.out.println(maxMul);
    }
}
