package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Exercise1 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List getValues(HashMap hshap) {
		List lis = new ArrayList();
		Collection list = hshap.values();
		lis.addAll(list);
		Collections.sort(lis);
		return lis;
		
	}
	
	public static void main(String[] args) {
		 
HashMap<String, Integer> hshap = new HashMap<String, Integer>();
        
         
	hshap.put("Sai", 3);
	hshap.put("krish", 12);
	hshap.put("Four", 4);
	hshap.put("kishore", 2);
	hshap.put("seven", 7);
	
	 System.out.println(getValues(hshap));
	
	
	}

}
