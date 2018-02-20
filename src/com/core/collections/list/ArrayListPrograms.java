package com.core.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ArrayListPrograms {

	public static void main(String[] args) {
		
		/** ArrayList
		 * DS is resizable array or growable array
		 *Where duplicate objects are allowed and insertion order is preserved 
		 *null insertion is possible 
		 *Every method present in ArrayList is not synchronized 
		 *Heterogeneous objects are allowed
		 *Best sutable for retrival operation 
		 *worst for insertion in middle 
		 * */
		// initial capacity 10 new cap=currentcapacity*3/2+1
		
		List<Student> student = new ArrayList<>(4);

		student.add(new Student(1, "A"));
		student.add(new Student(5, "E"));
		student.add(new Student(3, "C"));
		student.add(new Student(2, "B"));
		student.add(new Student(4, "D"));
		student.add(1, new Student(1, "test"));

		Student student1 = new Student(1, "A");
		student.add(student1);
		student.add(null);
		// to get synchronized list
		List<Student> synchList = Collections.synchronizedList(student);
		Collection<Student> s = Collections.synchronizedCollection(student);

	}

}
