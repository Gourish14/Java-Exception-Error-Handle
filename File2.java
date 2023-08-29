package com.cozentus.Exception_Error_Handle;

import java.util.Scanner;

public class File2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try {
            checkForVowels(input);
            System.out.println("String contains vowels.");
        } catch (NoVowelsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkForVowels(String str) throws NoVowelsException {
        if (!str.matches(".*[AEIOUaeiou].*")) {
            throw new NoVowelsException("String doesn't contain any vowels.");
        }
    }
}

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}

