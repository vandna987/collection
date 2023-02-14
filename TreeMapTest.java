package com.monocept.model;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(1, "ashok");
		tMap.put(5, "ekta");
		tMap.put(3, "chinki");
		tMap.put(6, "faruk");
		tMap.put(2, "bhola");
		tMap.put(4, "dinesh");
		
		System.out.println("Show the key set of the map:- "+tMap.keySet());
		System.out.println("Show all the values of the map:- "+tMap.values());
		System.out.println("Tell this key is present or not:- "+tMap.containsKey(6));
		System.out.println("Give the value of particular key:- "+tMap.get(1));
		System.out.println("Remove the pair where key is this:- "+tMap.remove(2));
		System.out.println("It will replace the value of the key:- "+tMap.replace(3, "after change"));
		System.out.println("It will show the size of the map:- "+tMap.size());
		System.out.println("It will show the whole map:- \n"+tMap.entrySet());
		
	}

}
