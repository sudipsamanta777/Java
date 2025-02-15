package Java.TelePractice;

public class ReverseAnumber {
    public static void main(String[] args) {
        int num = 847462;
        int rev = 0; // create a new integer var rev
        String num1 = Integer.toString(num); // convert the number into string for calculate the length of the number
        for(int i=1; i<= num1.length(); i++){
            int remainder = num%10; // find out last number of number
            rev = remainder + rev*10;
            num = num/10; // size of the number is decreased from last
        }
        System.out.println("Reverse : "+rev);
    }
}
