package com.cozentus.Exception_Error_Handle;

import java.util.Scanner;

public class Practise4 {
		public static String Exception(String message) {
		return message;
		}
		
		public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements in array : ");
		n = sc.nextInt();
		
		int arr[] = new int [n];
		
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		arr[i]=sc.nextInt();  
		}  
		
		try {
			for(int i = 0; i <n; i++) {  
	            for(int j = i + 1; j < n; j++) {  
	                if(arr[i] == arr[j])  {
	                throw new Exception("Duplicate Values are there");	
	                }
	            }
			}
		}   	
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
