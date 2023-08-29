package com.cozentus.Exception_Error_Handle;

import java.util.Scanner;
public class Practise3 {
	
	public static String Exception(String message) {
		return message;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		try {
		if (num%2==1) {
		throw new Exception("Given number is a odd number");
		}
		else {
			System.out.println("Given number is an even number");
		}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	

}

