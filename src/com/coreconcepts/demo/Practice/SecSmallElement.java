/*
 * Exercise 5: Create a method which accepts an array of integer elements
 * 				 and return the second smallest element in the array
 * 
 ***************************************************************************/


package com.coreconcepts.demo.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SecSmallElement {
	
	public static int getSecondSmallest(int []ar) {
		
		ArrayList<Integer> arlist= new ArrayList<>(ar.length) ;
		
		for(int a:ar) {
			arlist.add(a);
		}
		
		 Collections.sort(arlist);
		 
		 return arlist.get(1);
		 
		 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements :");
		for(int a=0;a<n;a++) {
			arr[a] = sc.nextInt();
		}
	
		System.out.println("Second Largest Element of given array "+ Arrays.toString(arr)+" is : "+getSecondSmallest(arr));
		

	}

}
