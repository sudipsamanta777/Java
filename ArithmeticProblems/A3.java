package Java.ArithmeticProblems;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
//        System.out.println(29 & -9);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if(num%3 == 0 && num %5 ==0){
            System.out.println("FizzBuzz");
        } else if (num%3 ==0) {
            System.out.println("Fizz");
        } else if (num%5 ==0) {
            System.out.println("Buzz");
        }else{
            System.out.println("Ekta valo number de.");
        }
        sc.close();

    }

    public static class A2 {
        public static void main(String[] args) {
            int a = 10;
            int b = 8;
            int c = 4;
            int d = 3;
            int e = c - d % a + a++ / --d + ++b;
            c = c++ + --d + a-- % 5;
            b = e++ - c++ * a++;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            System.out.println("e = " + e);
        }

        public static class A1 {
            public static void main(String[] args) {
                int a = 10;
                int b = 14;
                int c = a++ + ++b;
                a = --a - a-- - ++b + b++;
                b += ++a;
                c = a - b;
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("c = " + c);
            }

        }
    }
}
