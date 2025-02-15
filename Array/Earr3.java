package Java.Array;

/*
wap to take input from user as a number and check its frefuency int this array..
 */
import java.util.Scanner;

public class Earr3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();

        int [] a = {5,7,7,3,2,5,3,7,1,4};
        int count = 0;
        boolean found = true;
        for(int i =0; i< a.length; i++){
            if(n == a[i]){
                count++;
            }else{
                found = false;
            }
        }
        System.out.println("Frequecy is = "+ count);

    }
}
