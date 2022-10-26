/*
 * Exercise2 Collection: Create a method that accepts a character array and 
 * 			count the number of times each character is present in the array.

 * 
 */

package com.coreconcepts.demo.Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountChar {
	
	public static Map<Character,Integer> countChar(char[] arey) {
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for(char chr: arey) {
			if(hmap.containsKey(chr)) {
				hmap.put(chr, hmap.get(chr)+1);
			}else {
				hmap.put(chr,1);
			}
		}
		return hmap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.next();
		//System.out.println("Enter the elements of the chr array : ");
		
		int n = str.length();
		char[] chArey = str.toCharArray();
		

		;
		for(Map.Entry entry : countChar(chArey).entrySet()) {
			System.out.println("Occurance of '"+entry.getKey()+"' : "+entry.getValue());
		}
	}

}
