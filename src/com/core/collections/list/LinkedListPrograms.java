package com.core.collections.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//1.2 version
public class LinkedListPrograms {
	public static void main(String[] args) {
		/**
		 * LinkedList
		 * 
		 * it is best suitable for insertion operations in middle because underlying data structure is double liked list
		 * 
		 * where every objects stores in a node, where each node is independent. every node is interlinked with other nodes by address
		 * 
		 * every node address is stored with previous node address
		 * worst for retrival operations
		 * suppose if we want to search 4th element it search from 1st element on wards  
		 * implements Serializable and clonable not RandomAccess interfaces
		 *
		 */
		// no capacity in LinkedList
		LinkedList<Object> linkedList = new LinkedList<>();

		linkedList.add(1);
		linkedList.add("A");
		linkedList.add("E");
		linkedList.add("F");
		linkedList.add("G");
		linkedList.add("H");
		// linked list 6 specific methods
		linkedList.addFirst("B");
		linkedList.addLast("K");
		linkedList.getFirst();
		linkedList.getLast();
		linkedList.removeFirst();
		linkedList.removeLast();
		linkedList.set(1, "C");
		linkedList.add(1, "D");
		List<Object> synlist = Collections.synchronizedList(linkedList);
		System.out.println(linkedList);
		
	}
}
