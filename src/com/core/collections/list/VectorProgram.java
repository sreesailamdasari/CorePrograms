package com.core.collections.list;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

//1.0 version legacy class
public class VectorProgram {
	public static void main(String[] args) {
		/**
		 * Legacy class same as Arraylist but every method present in vector is
		 * Synchronized
		 * 
		 */
		Vector<Object> vector = new Vector<>();

		// add elements
		vector.add("abc");// provided by collection interface
		vector.addElement("bcd");// provided by vector class
		vector.add(1, "cde");// provided by List interface
		vector.add("def");
		vector.add("efg");
		vector.add("fgh");
		vector.add("ghi");
		System.out.println(vector);
		vector.remove(6);
		vector.remove("def");
		vector.removeElement("efg");
		System.out.println(vector);
		System.out.println(Collections.replaceAll(vector, "abc", "cba"));
		System.out.println(vector);
		// iterating the vector
		System.out.println("Iterating by Enumeration");
		Enumeration<Object> en = vector.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());

		}
	}
}
