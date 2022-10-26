/*
 * Exercise 7: Create a method which accepts an integer array,
 *  			reverse the numbers in the array and returns the 
 *  			resulting array in sorted order
 *  
 * *****************************************************/

package com.coreconcepts.demo.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GetSortedAr {
	
	public static int[] getSorted(int[] ar) {
		
		StringBuffer stb;
		int n = ar.length;
		ArrayList<Integer> arlist = new ArrayList<>();
		for(int a=0;a<n;a++) {
			stb=new StringBuffer();
			StringBuffer y=stb.append(String.valueOf(ar[a])).reverse();
			ar[a]=Integer.parseInt(y.toString());
			
		}
		
		for(int a:ar) {
			arlist.add(a);
		}
			
		Collections.sort(arlist);
		
		int[] result = new int[n];
		int i=0;
		for(Integer a:arlist) {
			result[i++]=a;
		}
		
		
		return result ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(getSorted(arr)));
		
		
		

	}

}
