package com.core.collections.list;

import java.util.LinkedList;

public class LinkedListPrograms {
	public static void main(String[] args) {
		/**
		 * LinkedList
		 * 
		 * it is best suitable for insertion operations in middle becoz
		 * underlying data structure is double liked list
		 * 
		 * where every objects stores in a node, where each node is independent
		 * . every node is interlinked with other nodes by address
		 * 
		 * every node address is stored with previous node address
		 * 
		 * worst for retrival operations
		 * 
		 * implements serializable and clonable not randomaccess interfaces
		 * 
		 * 
		 */
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
		System.out.println(linkedList);
	}
}
