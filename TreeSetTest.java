package com.monocept.model;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<Integer> tSet = new TreeSet<>();
		tSet.add(1);
		tSet.add(10);
		tSet.add(27);
		tSet.add(13);
		tSet.add(20);
		tSet.add(15);
		tSet.add(12);
		tSet.add(5);
		
		System.out.println("It will show the set is empty or not:- "+tSet.isEmpty());
		System.out.println("It will tell the item is present in the set or not:- "+tSet.contains(20));
		System.out.println("It will remove the particular item from the set:- "+tSet.remove(15));
		System.out.println("It will tell the size of the set:- "+tSet.size());
		Iterator<Integer> it = tSet.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
	}

}
