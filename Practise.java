package com.cozentus.Exception_Error_Handle;

public class Practise {
	public static void main(String [] args) {
	try {
	int age = 19 ;
	if (age>18) {
	System.out.println("He/she is eligble for LL");
	}
	else {
		System.out.println("He/she is not eligible");
	}
	}
	catch(Exception e){
		System.out.println("He/she is not eligible for LL");
	}
	}
}
