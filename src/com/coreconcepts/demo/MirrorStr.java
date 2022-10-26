/******************************************************************************

Exercise 2: Create a class containing a method to create the mirror 
            image of a String. The method should return the two Strings 
            separated with a pipe(|) symbol .

*******************************************************************************/

package com.coreconcepts.demo;
import java.util.Scanner;

public class MirrorStr
{
    
    public static String mirrorStr(String st){
        
        StringBuilder rst =new StringBuilder(st);
        
        String y = String.join("",st,"|",rst.reverse());        
        
        return y;
    }
    
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the String : ");
	    
	    String str = sc.next();
	    
	    System.out.println(mirrorStr(str));
		
	}
}
