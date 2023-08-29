package com.cozentus.Exception_Error_Handle;

public class Practise1 {
	
	public static long recFact(int n) {
		
		if(n==0||n==1) {
			return 1;
		}
		else 
			return n*recFact(n-1);
		}
	
	public static void main(String[] args) {
		int num=20;
		long fact = recFact(num);
		System.out.println(fact);
	}
}