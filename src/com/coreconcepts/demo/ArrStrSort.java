/**********************************************************************************
 
 Exercise 2: Create a method that can accept an array of String objects and 
 			 sort in alphabetical order. The elements in the left half should be completely 
 in uppercase and the elements in the right half should be completely in lower case. Return the resulting array.

Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE
 ***********************************************************************************/

package com.coreconcepts.demo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrStrSort {
	
	static String sortStrings(String[] input) {
		
		Arrays.sort(input);
		return Arrays.toString(input);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int n = sc.nextInt();
		String[] nword=new String[n];
		
		for(int i =0;i<n;i++) {
			nword[i]=sc.next();
		}
		
		
		System.out.println("Actual Array before sorting :\n "+Arrays.toString(nword));
		System.out.println("after sorting th array :\n"+sortStrings(nword));
		
		
		
		

	}

}
