package com.core.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

//version 1.2v
public class ArrayListPrograms {

	public static void main(String[] args) {

		/**
		 * ArrayList DS is resizable array or growable array Where duplicate
		 * objects are allowed and insertion order is preserved null insertion
		 * is possible Every method present in ArrayList is not synchronized
		 * Heterogeneous objects are allowed Best sutable for retrival operation
		 * worst for insertion in middle
		 */
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
		System.out.println(student);
		// to get synchronized list
		List<Student> synchList = Collections.synchronizedList(student);
		Collection<Student> s = Collections.synchronizedCollection(student);
		System.out.println("synchronized list:" + synchList);
		/**
		 * we can retrive the objects by using the cursors like Iterator and
		 * ListIterator
		 * 
		 */

		// By Using the ListIterator

		ListIterator<Student> st = student.listIterator();

		while (st.hasNext()) {
			Student stu = st.next();
			System.out.println(stu);
		}

		for (Student student2 : s) {
			System.out.println(student2);
		}

		for (ListIterator<Student> stu = student.listIterator(); stu.hasNext();) {
			Student stuuu = stu.next();
			System.out.println("for each listite:" + stuuu);
		}
		// by using the Java8 features
		System.out.println("***** By using the Java8 features *****");
		student.forEach(stu -> System.out.println(stu));

	}

}
