package Java.ArithmeticProblems;

public class PrimeNumber {
    public static void main(String[] args){
        int num = 6;
        int count = 0;
        for(int i =1; i<=5; i++){ // Loop for find the numbers in the range of this number.

            if(num % i == 0){
                count++;
            }
        }//System.out.println(count);
        if(count == 2){ // Statement for checking the Number if It is prime or not
            System.out.println("This Number is a Prime Number");
        }else{
            System.out.println("Not Prime");
        }
    }
}
