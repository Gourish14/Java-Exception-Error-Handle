package com.cozentus.Exception_Error_Handle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class File4 {
	public static void main(String [] args) throws Exception{
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("Resume.txt"));){
			writer.write("Welcome to my Resume");
			writer.newLine();
			writer.write("Hello Viewers !! My name is Gourish Bhagat");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try(BufferedReader bf = new BufferedReader(new FileReader("Gourish.txt"));) 
		{
			String document;
			boolean fileFound=false;
			if(fileFound==true) {
				while((document = bf.readLine())!=null)
				System.out.println(document);
			}
			else {
				throw new Exception("Field is empty");
			}
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}
