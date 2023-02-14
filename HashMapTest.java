package com.monocept.model;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "anubhav");
		myMap.put(5, "ekta");
		myMap.put(3, "Chetana");
		myMap.put(2, "bhavesh");
		myMap.put(4, "devesh");
		
		System.out.println(myMap.clone());
		System.out.println("It will return true if the key is in map:- "+myMap.containsKey(1));
		System.out.println("It will return true if the value is in map:- "+myMap.containsValue("ekta"));
		System.out.println("Return the value at index:- "+myMap.get(1));
		System.out.println("Tell the map is empty or not:- "+myMap.isEmpty());
		System.out.println("Remove the value from the key & value is:- "+myMap.remove(2));
		System.out.println("Replace the value of this key and old value is:- "+myMap.replace(3, "bhavika"));
		System.out.println("Tell the size of the map:- "+myMap.size());
		System.out.println("Show the whole map"+myMap.entrySet());
		System.out.println("Give all the keys:- "+myMap.keySet());
		System.out.println("Give all the values:- "+myMap.values());
		
 	}

}
