package com.cozentus.Exception_Error_Handle;

public class Practise2 {
	
	public static boolean ValidPassword(String password) {
        if (password.length() != 8) {
            return false;
        }

        boolean upperCase = false;
        boolean lowerCase = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCase = true;
            } 
            else if (Character.isLowerCase(ch)) {
                lowerCase = true;
            } 
            else {
                return false;
            }
        }
        return upperCase && lowerCase;
    }
	
	public static void main(String[] args) {

        try {
            String password = "Gourishh";

            if (ValidPassword(password)) {
                System.out.println("Valid");
            } else {
                throw new Exception("Invalid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
}
