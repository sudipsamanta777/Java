package Java.ArithmeticProblems;

public class Fibbonacci {
    public static void main(String[] arg){
        int n = 10, num1 = 0, num2 = 1;
        System.out.print("Java.ArithmeticProblems.Fibbonacci Series: \n"+ num1 +", "+ num2);
        for(int i = 2; i < n ; i++){
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(", "+ num3 );
        }
    }
}
