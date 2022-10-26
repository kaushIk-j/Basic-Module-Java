/************************************************************************************************
   Create a method to accept date and print the duration in days, 
   months and years with regards to current system date.
 ************************************************************************************************/

package com.coreconcepts.demo.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DemoPeriod {
	
	static int acptDate(LocalDate ld2) {
		
		LocalDate ld=LocalDate.now();
		
		Period p = Period.between( ld2,ld );
		return p.getDays();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the future date (in format YYYY-MM-DD) : ");
		String tdate = sc.next();
		LocalDate ld1 = LocalDate.parse(tdate);
		
		
		System.out.println("Total duration in days is :"+acptDate(ld1)+"days");
	}

}
