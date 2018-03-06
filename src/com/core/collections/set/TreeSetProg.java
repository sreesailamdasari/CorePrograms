package com.core.collections.set;

import java.util.TreeSet;

//1.2 V
public class TreeSetProg {
	/**
	 * TreeSet:
	 * DS is balanced tree
	 * no duplicates and no insertion order(some sorting order)
	 * no heterogeneous objects allowed , if we are trying to add will get CCE 
	 * 
	*/
	public static void main(String[] args) {
		TreeSet<Object> treeSet = new TreeSet<>();
//		treeSet.add(null);//NPE
		treeSet.add("AAAAA");
//		treeSet.add(11);// CCE
		treeSet.add("a");
		treeSet.add("B");
		treeSet.add("D");
//		treeSet.add(null);//NPE
//		treeSet.clear();
//		treeSet=null;
//		treeSet.add(null);
		System.out.println(treeSet);
		//becoz every class as implement comparable but not StringBuffer
		/*
		 * TreeSet<Object> treeSetCompa = new TreeSet<>(); treeSetCompa.add(new
		 * StringBuffer("A")); treeSetCompa.add(new StringBuffer("S"));
		 * treeSetCompa.add(new StringBuffer("Z"));
		 * System.out.println(treeSetCompa);
		 */
		
		
		
		
	}
}
