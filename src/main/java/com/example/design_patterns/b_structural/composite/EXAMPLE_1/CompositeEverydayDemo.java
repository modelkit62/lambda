package com.example.design_patterns.b_structural.composite.EXAMPLE_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CompositeEverydayDemo {

	public static void main(String args []) {
		Map<String, String> personAttributes = new HashMap<>();
		
		personAttributes.put("site_role", "person");
		personAttributes.put("access_role", "limited");
		
		Map<String, String> groupAttributes = new HashMap<>();
		
		groupAttributes.put("group_role", "claims");
		
		Map<String, String> secAttributes = new HashMap<>();
		
		secAttributes.putAll(personAttributes);
		secAttributes.putAll(groupAttributes);
		
		System.out.println(secAttributes);

		Set<Map.Entry<String, String>> entries = secAttributes.entrySet();

		/*
		ERROR
		Iterator<Map.Entry<String, String>> iterator = entries.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next().getKey() + " " + iterator.next().getValue());
		}*/

		Set<Map.Entry<String, String>> entries1 = entries;
		for(Map.Entry<String, String> e : entries){
			System.out.println(e.getKey() + " " + e.getValue());
		}


	}
}
