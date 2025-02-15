package Java.TelePractice;

public class OddNumbers {
    public static void main(String[] args) {
        int i = 9;
        System.out.println("Odd numbers between 9 to 48 : ");
        while (i<=48){
            if(i%2 !=0){
                System.out.println(i);
            }i++;
        }
    }
}
