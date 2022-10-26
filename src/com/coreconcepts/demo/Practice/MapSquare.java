package com.coreconcepts.demo.Practice;

import java.util.*;

public class MapSquare {
	
	public static HashMap getSquares(int[] sqar) {
		
		HashMap<Integer,Integer> hsmp = new HashMap<Integer,Integer>();
		
		for(int a:sqar) {
			hsmp.put(a,a*a);
		}
		
		return hsmp;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the the elemets of array : ");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		
		HashMap<Integer,Integer> mhmap = getSquares(arr);
		
		Iterator <Integer> itfor= mhmap.keySet().iterator();
		
		while(itfor.hasNext()){
		    Integer key = itfor.next();
		      System.out.println(key + " : " + mhmap.get(key));
		    }
			
		}
		
		
		
	}

