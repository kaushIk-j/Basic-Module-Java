package com.coreconcepts.demo.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InpOpSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\KGIRINDR\\Documents\\demo.txt");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\KGIRINDR\\Documents\\demoTest.txt");
			int fbyte;
			
			while((fbyte=fin.read()) != -1) {
				fout.write(fbyte);
			}
			
			
	        fin.close();
	        
	        System.out.print("File is being Created and Written....!!");
	            
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

}
