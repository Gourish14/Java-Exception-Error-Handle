package com.cozentus.Exception_Error_Handle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File6 {
	
	public static void main(String [] args) throws IOException, FileNotFoundException {
		
		try (BufferedReader bf = new BufferedReader(new FileReader("Gourish.txt"))) {
            
			boolean fileFound = false;
            if (fileFound == true) {
                System.out.println("File Found");
            }
            else {
                throw new FileNotFoundException("File Not Found");
            }
        } 
		catch (FileNotFoundException e) {
            System.out.println(e);
        } 
		catch (IOException e) {
            System.out.println(e);
        }
	}
}
