package Java.OOP;

import java.util.Scanner;

public class PassWordCheck {
    private String password;

    public PassWordCheck(String password){
        this.password = password;
    }

    public boolean isValid(String password){
        if(password.length() < 8 ){ // check the length of the password is 8 or greater than 8 otherwise return false.
            return  false;
        }
        boolean hasUpperCase = false; // intitaily Uppercase value is false
        boolean hasDigit = false; // initially digits value is false
        for(char ch : password.toCharArray()){
            if(Character.isUpperCase(ch)){
                hasUpperCase = true; // found an UpperCase
            }
            if(Character.isDigit(ch)){
                hasDigit = true; // Found at least one numeric value
            }
            if(hasDigit && hasUpperCase){
                return true;
            }
        }
        return false; // if these conditions does not meet the return false
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password : ");

        String inputPassword = scanner.nextLine();
        scanner.close();

        PassWordCheck validator = new PassWordCheck(inputPassword);

        if(validator.isValid(inputPassword)){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid password");
        }
    }
}

