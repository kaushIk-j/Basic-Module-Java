package com.coreconcepts.demo.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TaskHash {

	public static ArrayList<Integer> getValues(HashMap<String, Integer> hsb) {
		
		ArrayList arr = new ArrayList();
		//Set sm = hsb.entrySet();
		
		for(Map.Entry me: hsb.entrySet()) {
			
			arr.add(me.getValue());
			
			
		}
		Collections.sort(arr);
		
		return arr;
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hs = new HashMap<String, Integer>();

		hs.put( "a",30);
		hs.put("b",3);
		hs.put( "d",56);
		hs.put( "c",78);

		System.out.println(getValues(hs));

	}

}
