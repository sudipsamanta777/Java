package Java.TelePractice;

import java.util.Scanner;

public class CountingCharsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");

        String str = sc.nextLine();
        Approach2(str);
//        String [] ch = str.split("");
                   //               Approach-1
        /* ============================================================================= */

       /*
       int numbers =0;
        int  others=0;
        int letters = 0;
        int spaces = 0;

        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                numbers++;
            } else if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            }else{
                others++;
            }
        }
        System.out.println(" Total Numbers : "+ numbers);
        System.out.println(" Total other chars : "+ others);
        System.out.println(" Total  letters : "+ letters);
        System.out.println(" Total spaces : "+ spaces);
        */

    }

    /*
                                        Approach-2
    ===============================================================================================
     */

    public static void Approach2(String str){
        int numbers =0 , spaces = 0, letters = 0, others =0;

        for(char ch : str.toCharArray()){
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                letters++;
            } else if (ch >= '0' && ch <= '9') {
                numbers++;
            } else if (ch == ' ') {
                spaces++;
            }else{
                others++;
            }
        }
        System.out.println("Total number of letters : "+ letters);
        System.out.println("Total number of numbers : "+ numbers);
        System.out.println("Total number of spaces : "+ spaces);
        System.out.println("Total number of others characters : "+ others);
    }
}
