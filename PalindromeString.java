package Java;

public class PalindromeString {
    public static void main(String[] srg){
        String str = "madam";
        // reverse the str string and store in reversed string
        String reversed = new StringBuilder(str).reverse().toString();

        // first check the reverse string if it is equals to str string
        // if equals then print true otherwise false..
        System.out.println(str.equals(reversed));

    }
}
