package com.core.collections.cursors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Cursors {
	public static void main(String[] args) {

		/**
		 * we if want to retrieve the collection objects one by one we have to
		 * use Cursors
		 * 
		 * There are three types of cursors 
		 * 1)Enumeration: 
		 * It is applicable to only for legacy classes and we can only retrieve the objects 
		 * we can not remove or add the objects in Enumeration
		 * 
		 * ********************* 
		 * 2)Iterator:
		 * It is a universal cursor and applicable to all the collection classes
		 * we can remove and retrieve the objects  
		 * only forward direction
		 * 
		 * 3)ListIterator:
		 * It is applicable only for any List objects
		 * we can add ,remove,replace and retrieve the objects
		 * bi-directional cursor 
		 * ListIterator is child interface of Iterator
		 * 
		 */
		Vector<Object> vector = new Vector<>();
		for (int i = 1; i <= 10; i++) {
			vector.addElement(i);
		}
		System.out.println(vector);
		//By Using the Enumeration 
		Enumeration<Object> enumeration = vector.elements();// To get the all elements 
		System.out.println(enumeration.getClass().getName());
		while (enumeration.hasMoreElements()) { // to retrieve one by one
			int i = (int) enumeration.nextElement(); // to get the current element
			if (i % 2 == 0) {
				System.out.println("Even Number : " + i);
			} else{
				System.out.println("Odd  Number : " + i);
			}
		}
		// By Using the Iterator
		List<Object> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add(1, 1);
		System.out.println(list);
		Iterator<Object> itr = list.iterator();
		System.out.println(itr.getClass().getName());
		while (itr.hasNext()) {// 1
			Object obj = itr.next();// 2
			System.out.println(obj);
			if ("A".equals(obj)) {
				itr.remove();// 3
			}
		}
		System.out.println("After removing :" + list);

		// By using the ListIterator
		ListIterator<Object> listIterator = list.listIterator();
		System.out.println(listIterator.getClass().getName());
		while (listIterator.hasNext()) {
			Object obj = listIterator.next();
			if (obj.equals(1)) {
				listIterator.add("D");
			}
			if (obj.equals("B")) {
				listIterator.set("A");
			}
		}
		System.out.println("List Iterator : "+list );
		
	}
}
