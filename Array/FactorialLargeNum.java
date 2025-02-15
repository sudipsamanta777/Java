package Java.Array;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FactorialLargeNum {
        public static List<Integer> factorial(int N) {
            BigInteger result = BigInteger.ONE;
            for (int i = 2; i <= N; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }

            List<Integer> digits = new ArrayList<>();
            String resultStr = result.toString();
            for (char digit : resultStr.toCharArray()) {
                digits.add(Character.getNumericValue(digit));
            }
            return digits;
        }

        public static void main(String[] args) {
            System.out.println(factorial(5));  // Output: [1, 2, 0]
            System.out.println(factorial(10)); // Output: [3, 6, 2, 8, 8, 0, 0]
        }

}
