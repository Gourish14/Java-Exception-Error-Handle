package com.cozentus.Exception_Error_Handle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File3 {
	public static void main(String [] args) throws Exception{
		
		try(BufferedReader bf = new BufferedReader(new FileReader("Resume.txt"));) 
		{
			String document;
			boolean fileFound=false;
			if(fileFound) {
				while((document = bf.readLine())!=null)
				System.out.println(document);
			}
			else {
				throw new Exception("Field is empty");
			}
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
