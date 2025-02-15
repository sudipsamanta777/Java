package Java.TelePractice;

public class Factors {
    public static void main(String[] args) {
        int num = 7832;
        System.out.println("Factors : ");
        for(int i =1; i<=num; i++){
            if(num%i == 0){
                System.out.println(i);
            }
        }
    }
}
