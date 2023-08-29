package com.cozentus.Exception_Error_Handle;
//Java Program to write in a file
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File {
	public static void main(String [] args) throws IOException{
		
		//Java Program to write in a file

		try(BufferedWriter writer = new BufferedWriter(new FileWriter("Resume.txt"));){
			writer.write("Welcome to my Resume");
			writer.newLine();
			writer.write("Hello Viewers !! My name is Gourish Bhagat");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
