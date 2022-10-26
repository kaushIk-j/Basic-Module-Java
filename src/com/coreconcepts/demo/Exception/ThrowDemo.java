package com.coreconcepts.demo.Exception;

import java.util.Scanner;

public class ThrowDemo {
	    //Throw exception if number 1 is greater than 900
	    static int add(int num1, int num2){
	      if (num1 > 900){
	         throw new ArithmeticException("Num 1 is greater than 900 and hence Exception is thrown");
	      }else{
	         System.out.println("Both parameters are correct!!");
	      }
	      return num1+num2;
	   }
	   public static void main(String args[]){
	        Scanner scanner = new Scanner(System.in);
	       System.out.println("Enter number 1 : ");
	       int num1 = scanner.nextInt();
	       System.out.println("Enter number 2 : ");
	       int num2 = scanner.nextInt();
	      int result=add(num1,num2);
	      System.out.println("Result is : "+result);
	   }
	}
