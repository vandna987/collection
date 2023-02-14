package com.monocept.model;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arrayList");
		int size = sc.nextInt();
		ArrayList<Integer> AList = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			int ele = sc.nextInt();
			AList.add(ele);
		}
		System.out.println("size of the list is:- " + AList.size());
		System.out.println("hash code of the list is :- " + AList.hashCode());
		System.out.println(AList.add(10));
		ArrayList<Integer> BList = new ArrayList<Integer>(size);

		BList.add(1);
		BList.add(2);
		System.out.println(AList.equals(BList));// it will check the reference
		System.out.println("Clone:- " + AList.clone());// it will print all element in the form of list
		System.out.println(AList.contains(1));
		System.out.println(AList.indexOf(5));// return -1 if element is not present in list
		System.out.println(AList.isEmpty());
		System.out.println("Last index of 2 is at index " + AList.lastIndexOf(2));
		System.out.println(AList.remove(1));// remove element from the given index
		System.out.println("Clone:- " + AList.clone());
		System.out.println(AList.getClass());
		System.out.println(AList.toString().getClass());
		System.out.println(AList.getClass());
		System.out.println(AList.get(4));
		// System.out.println(AList.clear());
		System.out.println(AList.set(4, 1000));// remove the element and shif
		AList.add(5, 1000);// add and adjust the element
		System.out.println("Clone:- " + AList.clone());
	}

}
