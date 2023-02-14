package com.monocept.model;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<Integer> lHashSet = new LinkedHashSet<>();
		lHashSet.add(10);
		lHashSet.add(20);
		lHashSet.add(15);
		lHashSet.add(12);
		lHashSet.add(22);
		lHashSet.add(9);
		lHashSet.add(18);
		lHashSet.add(17);
		
		System.out.println("It will tell either the item presennt in the set or not"+lHashSet.contains(100));
		System.out.println("It will tell the size of the set:- "+lHashSet.size());
		System.out.println("It will tell the set is empty or not:- "+lHashSet.isEmpty());
		System.out.println("It will rwmove the element in the set if present"+lHashSet.remove(10));
		System.out.println("--------------Iterating the set--------------");
		Iterator<Integer> it = lHashSet.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
	}

}
