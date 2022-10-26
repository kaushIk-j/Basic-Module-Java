

/******************************************************************************

Exercise 1: Write a Java program that reads a line of integers and 
            then displays each integer and the sum of all integers. 

*******************************************************************************/

package com.coreconcepts.demo;
import java.util.Scanner;

public class Readline
{
    
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter no of number you want to add: ");
	    int n = sc.nextInt();
	    int sum = 0;
	    
	    String[] strline=new String[n] ;
	    
	    System.out.println("Enter the numbers: ");
	    for(int i = 0; i<n;i++)
	          strline[i] = sc.next();
	    
	    for(String str:strline){
	        System.out.print(str+"\t");
	        sum+=Integer.parseInt(str);
	    }
	    
	    System.out.println("\ntotal Sum : "+sum);
		
	}
}
