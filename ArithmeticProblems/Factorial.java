package Java.ArithmeticProblems;

public class Factorial {
    public static void main(String[] args){
        int num = 5;
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }System.out.printf("Java.ArithmeticProblems.Factorial of %d = %d ",num, fact);
    }
}
