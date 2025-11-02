package Java.Array;

public class AdditionOfDigits {
    public static void main(String[] args) {
        int n = 5674;
        int sum = 0;
        int num =0;
        // Naive Approach..

        while(n > 0){
            sum += n%10;
            n /= 10;
            num = sum;
        }
        while(num > 9){
            sum =0;
            while(num > 0){
                sum += num%10;
                num /= 10;
            }
        }
        System.out.println(sum);

    }
}
