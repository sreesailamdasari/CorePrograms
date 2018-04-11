package com.core.util;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Fail-Fast iterators, returned by most of the collection types, doesn’t
 * tolerate any structural modifications to a collection while iterating over
 * it. (Structural modifications means add, remove or updating an element in the
 * collection) They throw ConcurrentModificationException if a collection is
 * structurally modified while iteration is going on the collection. But, they
 * don’t throw any exceptions if the collection is modified by the iterator’s
 * own methods like remove().
 * 
 */
public class FailFast {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		ListIterator<String> itr = list.listIterator();
		while (itr.hasNext()) {
			String str = itr.next();
			list.add("E"); // will throw the exception if we are modifing the object or collection type
			// itr.remove(); // if we write own iteration methods it wont throw any
			// exception
			/**
			 * All Collection types maintain an internal array of objects ( Object[] ) to
			 * store the elements. Fail-Fast iterators directly fetch the elements from this
			 * array. They always consider that this internal array is not modified while
			 * iterating over its elements. To know whether the collection is modified or
			 * not, they use an internal flag called modCount which is updated each time a
			 * collection is modified. Every time when an Iterator calls the next() method,
			 * it checks the modCount. If it finds the modCount has been updated after this
			 * Iterator has been created, it throws ConcurrentModificationException.
			 */
			System.out.println(str);

		}
	}
}
