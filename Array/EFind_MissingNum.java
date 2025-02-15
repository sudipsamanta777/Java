package Java.Array;

public class EFind_MissingNum {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr) {
        // code here
        int n = arr.length;
        int totalSum = 0;
        for(int i =1; i<=n+1; i++){
            totalSum += i;
        }
        //System.out.println(totalSum);
        int sum =0;
        for(int num:arr){
            sum += num;
        }
        int m_Num = totalSum - sum;
//        System.out.println(totalSum - sum);
        return m_Num;
    }
}
