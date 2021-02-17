package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
Create a method which accepts the id and the age 
of people as a Map and decide if
they are eligible for vote. 
A person is eligible for vote if his age 
is greater than 18. Add the IDs of
all the eligible persons to list and
return the list.
		*/
public class Exercise6 {
	public static List votersList(Map<Integer,Integer> voteDet) {
		System.out.println(voteDet);
		List<Integer> lis = new ArrayList<Integer>();
		Iterator it = voteDet.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			if((int)pair.getValue()>=18) {
				lis.add((int)pair.getKey());
			}
		}
		
		return lis;
		 

	}
	public static void main(String[] args) {
		Map<Integer,Integer> s = new HashMap<Integer,Integer>();
		s.put(300, 21);
		s.put(305, 18);
		s.put(370, 17);
		s.put(380, 25);
		s.put(301, 21);
		System.out.println(votersList(s));
	}

}
