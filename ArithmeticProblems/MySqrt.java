package Java.ArithmeticProblems;

public class MySqrt {
    public static int mySqrt(int x) {
//        return (int)Math.sqrt(x);
        // using Binary Search:----------------------------
        if(x == 0 || x == 1) return x;
        int left = 1, right = x;
        int result = 0;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(mid <= x/mid){
                result = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 144;
        System.out.println(mySqrt(x));
    }
}
