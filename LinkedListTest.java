package com.monocept.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		//List Creation
		LinkedList<Integer> myList = new LinkedList<>();
		//Add element in List 
		myList.add(10);
		myList.add(20);
		myList.addFirst(50);
		myList.addLast(300);
		myList.add(1000);
		myList.add(11);
		myList.add(25);
		myList.add(23);
		
		System.out.println("This is clone, It clone all element of list:- "+myList.clone());
		System.out.println("Contain will show either list contains particular value of not:- "+myList.contains(18));
		
		
		System.out.println("It will show the index of element in list and it is 1base index:- "+myList.indexOf(50));
		System.out.println("It will show either the list is empty of not:- "+myList.isEmpty());
		System.out.println("It will show the last index in which the element is present:- "+myList.lastIndexOf(300));
		myList.offer(99);//add the element at last
		myList.offerFirst(55);//add element at first
		myList.offerLast(25);//add the element at last
		myList.remove(1);//it will remove the item from the list at particular index
		myList.removeFirstOccurrence(0);//it will remove the first occurance of item
		myList.removeLastOccurrence(1);//it will remove the last occurance of element
		System.out.println(myList.clone());
		System.out.println("Give the element at particular index"+myList.get(2));
		System.out.println("Return the size of list & that is :- "+myList.size());
		System.out.println("Return first element from the list & that's:- "+myList.element());//it will show the first element of the list
		System.out.println("Return the first element of the list & that's:- "+myList.getFirst());//give the first element in the list
		System.out.println("Return the last element of the list & that's:- "+myList.getLast());//give the last element in the list
		System.out.println("Return the first element of the list & that's:- "+myList.peek());//peek the first element in the list
		System.out.println("Return the first element of the list & that's:- "+myList.peekFirst());//peek the first element
		System.out.println("Return the last element of the list & that's:- "+myList.peekLast());//peek the last element
		System.out.println("Return the first element of the list and remove from list & that's:- "+myList.poll());//it will give the first element and remove from the list (peek+pop)
		System.out.println("Return the first element of the list and remove from list & that's:- "+myList.pollFirst());
		System.out.println("Return the last element of the list and remove from list & that's:- "+myList.pollLast());
		System.out.println(myList.clone());
		Collections.sort(myList);
		//how can we iterate the linked list
				ListIterator<Integer> it = myList.listIterator();
				while(it.hasNext()) {
					Integer i =it.next();
					System.out.println(i);
				}
//		myList.pop();//remove the first element from the list
//		myList.remove();
//		myList.removeFirst();
//		myList.removeLast();
		
		myList.set(1, 22);//replace the element at particular index 
		System.out.println(myList.clone());
		System.out.println();
	}

}
