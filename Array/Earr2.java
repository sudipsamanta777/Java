package Java.Array;

import java.util.Scanner;

public class Earr2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();

        int [] a = {5,7,3,6,1,2,3};
        boolean found = false;

        for(int i=0; i<a.length; i++){
            if(n == a[i]){
                found = true;
            }
        }
        if(found){
            System.out.println("Present in this array");
        }else{
            System.out.println("NotPresent in this array");

        }
    }
}
