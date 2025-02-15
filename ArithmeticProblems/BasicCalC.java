package Java.ArithmeticProblems;

public class BasicCalC {
    public static void main(String[] args){
        int a = 10;
        int b = 3;
        int c = 5;
        int result = a - b * c + a / b % c;
        System.out.println(result);
        // output : -2
    }

}