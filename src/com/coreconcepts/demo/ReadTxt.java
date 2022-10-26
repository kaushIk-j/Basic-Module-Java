/******************************************************************************

Exercise 5: Write a Java program that displays the number of characters,
            lines and words in a text?

*******************************************************************************/

package com.coreconcepts.demo;
import java.util.Scanner;

public class ReadTxt {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    int flag = 0,nw=0,nch=0,n=3;
	    String s="";
	    while(n>0){
	        String text = sc.nextLine();
	        String nchr = text.replace(" ","");
	        nch+=nchr.length();
	        String[] nword = text.split(" ");
	        nw+=nword.length;
	        flag++; 
	        n--;
	        
	    }
	    
	    
	    System.out.println("\nno. of characters : "+nch
	                        +"\nno. of words : "+nw
	                        +"\nno.of lines : "+flag);

	}

}
