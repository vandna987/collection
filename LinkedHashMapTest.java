package com.monocept.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<Integer, String> lHMap = new LinkedHashMap<Integer, String>();
		lHMap.put(1, "hello");
		lHMap.put(2, "hey");
		lHMap.put(3, "tata");
		lHMap.put(4, "bye");
		lHMap.put(5, "morning");
		lHMap.put(6, "night");
		lHMap.put(7, "sleep");
		
		System.out.println("It will tell that either the key present in map or not:- "+lHMap.containsKey(1));
		System.out.println("It will give the value at given key:- "+lHMap.get(1));
		System.out.println("Remove the entry where key is given & value is:- "+lHMap.remove(1));
		System.out.println("Replace the value at particular key:- "+lHMap.replace(2, "CHANGED"));
		System.out.println("Tell the size of the map:- "+lHMap.size());
		System.out.println("Tell that this value is present in the map or not:- "+lHMap.containsValue("morning"));
		System.out.println("Show the whole map:- "+lHMap.entrySet());
		System.out.println("Tell that map is empty or not:- "+lHMap.isEmpty());
		System.out.println("Show all the keys:- "+lHMap.keySet());
		System.out.println("Show all the values:- "+lHMap.values());
		
	}

}
