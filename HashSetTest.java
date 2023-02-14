package com.monocept.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("rama");
		hashSet.add("sangeeta");
		hashSet.add("krishna");
		hashSet.add("jaya");
		hashSet.add("vandna");
		hashSet.add("pari");
		hashSet.add("paridhi");
		
		System.out.println("It will tell either the item is present in the set or not:- "+hashSet.contains("jaya"));
		System.out.println("It will tell either the set is empty or not:- "+hashSet.isEmpty());
		System.out.println("It will remove the item from the set"+hashSet.remove("pari"));
		System.out.println("It will tell the size of the set:- "+hashSet.size());
		//iterating the set
		System.out.println("-----------iterating the set------------");
		Iterator<String> it = hashSet.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}
	
}
