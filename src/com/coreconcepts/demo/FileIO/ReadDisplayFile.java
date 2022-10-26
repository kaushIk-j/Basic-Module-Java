/*
 * Exercise 1: Write a Java program that reads a file and displays the file on the screen,
 * 			   with a line number before each line?
 * 
 */


package com.coreconcepts.demo.FileIO;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ReadDisplayFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.out.println("welcome to demo");
		//File f= new File("A.txt");
		FileReader fr = new FileReader("A.txt");
		//BufferedReader br = new BufferedReader(fr);
		LineNumberReader lnr= new LineNumberReader(fr);
		
		String s;
		
		while((s=lnr.readLine())!=null) {
			System.out.println(lnr.getLineNumber()+" "+s);
		}
		
		
	}

}
