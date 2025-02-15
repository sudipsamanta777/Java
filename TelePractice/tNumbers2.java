package Java.TelePractice;

import java.util.Scanner;

public class tNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number(t) : ");
        int t = sc.nextInt();
        for(int i =1; i<=t ; i++){
            int num ;
            do{
                System.out.println("Enter number"+i+" :");
                num = sc.nextInt();
                if(num<81){
                    System.out.println("Number should be greater or equals to 81");
                }
            }while(num < 81);
            for(int j =24; j<=num; j++){
                if(num%j ==0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
        sc.close();

    }
}
