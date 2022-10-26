/******************************************************************************
Exercise 4: Create a method that accepts a number and modifies it 
    such that the each of the digit in the newly formed number is equal
    to the difference between two consecutive digits in the original number.
    The digit in the units place can be left as it is.
    i/p : 4839		o/p : 4569

Note: Take the absolute value of the difference. Ex: 6-8 = 2

*******************************************************************************/


package com.coreconcepts.demo;

import java.util.Scanner;

public class ModifyNum{
	
	static int modifyNumber(int n,String str) {
		
		StringBuilder stb= new StringBuilder();
		int a[] = new int[n];
	    String[] strline = str.split("") ;
	    
	    for(int i = 0; i<n-1;i++)
	          a[i] = Integer.parseInt(strline[i])-Integer.parseInt(strline[i+1]);
	    a[n-1]=Integer.parseInt(strline[n-1]);
	    
	    
	    for(int st:a){
	        stb.append(Integer.toString(Math.abs(st)));
	    }
	    
	    return Integer.parseInt(stb.toString());
	    
	}
       
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    
	    
	    /*System.out.print("Enter the no of digit : ");
	    int n = sc.nextInt();*/
	    System.out.print("Enter the number :");
	    int n = sc.nextInt();
	    String str = Integer.toString(n);
	    
	    
	    System.out.println("Result : "+modifyNumber(str.length(),str));
	    
		
	}
}

