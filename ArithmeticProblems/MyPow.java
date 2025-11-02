package Java.ArithmeticProblems;

public class MyPow {
    public static double myPow(double x, int n) {
        // return Math.pow(x, n);

        long N = n; // Convert to long to avoid overflow when n == Integer.MIN_VALUE
        if (N < 0) { // handle negative values
            x = 1 / x;
            N = -N;
        }
        double result = 1.0;
        while (N > 0) {
            if ((N % 2) == 1) {
                result *= x;
            }
            x *= x;
            N /= 2;
        }
        /*
        for(int i = 1; i < N; i++){
            result *= x;
        }
         */
        return result;
    }

    public static void main(String[] args) {
        double x = 0.44528;
        int n = 0;
        System.out.println(myPow(x, n));
    }
}
