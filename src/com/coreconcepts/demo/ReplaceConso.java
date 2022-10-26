/****************************************************************************
 
 Exercise 3: Create a method which accepts a String and replaces 
 			 all the consonants in the String with the next alphabet.
 			 
 ****************************************************************************/


package com.coreconcepts.demo;

import java.util.Scanner;

public class ReplaceConso {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    StringBuffer stb = new StringBuffer();
	    
	    System.out.println("Enter the String : ");
		String []st = sc.next().split("");
		int n= st.length;
		//char y;
		
		for(int i = 0 ; i<n ;i++){
		    if(st[i].equalsIgnoreCase("a") || st[i].equalsIgnoreCase("e") ||
		    		st[i].equalsIgnoreCase("i")|| st[i].equalsIgnoreCase("o")|| st[i].equalsIgnoreCase("u")){
		     
		        stb.append(st[i]);
		    }
		    else{
		    //int z = st[i].codePointAt(0);
		    char y = (char) (st[i].codePointAt(0) + 1);
		    stb.append(y);
		    
		    }
		}
		
		System.out.println("After  replacing "
				+" all the consonants in the String : "+stb.toString());
	}

}
