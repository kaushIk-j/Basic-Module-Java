package com.coreconcepts.demo.Practice;

import java.util.ArrayList;
import java.util.Map;

public class Student {
	
	private ArrayList<String> names = new ArrayList<>();

	public void setNames(String name) {
		names.add(name);
	}
	public void searchName(String name) {
		names.indexOf(name);
	}
	public void printNames( ) {
		for(String a:names) {
			System.out.println(a);
		}
	}
	public void searchName(int index) {}
	public void removeName( String stuName ) {
		names.remove(stuName);
	}
	

}
