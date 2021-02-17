package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise4 {
	
	
	private static Map getStudents(Map<Integer, Integer> hm) {
	
		
		/*
		 * for(Integer i:hm) { System.out.println(i); }
		 */
		Map<String, Integer> prize= new HashMap<String, Integer>(); 
		
		Iterator it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if((int)pair.getValue()>=90) {
				prize.put("Gold",(int)pair.getKey());
			}
			else if((int)pair.getValue()>=80 && (int)pair.getValue()<90) {
				prize.put("Silver",(int) pair.getKey());
			}
			else if((int)pair.getValue()>=70 && (int)pair.getValue()<80) {
				prize.put("Bronze",(int) pair.getKey());
			}
			
		}
		
		
		return prize;
		 
	}
	
 

	public static void main(String[] args) {
		
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(9802, 90);
		hm.put(9306,80);
		hm.put(9007, 70);
		System.out.println(getStudents(hm));
	}

}
