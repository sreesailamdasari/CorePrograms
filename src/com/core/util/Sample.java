package com.core.util;

public class Sample {

	public static void main(String[] args) {
		
		int a[]= {1,2,3};
		int i[]= {1,2,3};
		a[1]=i[1]=10;
		System.out.println(a[1]+"--"+i[1]);
		"aAHello world!".chars().forEach(System.out::println);
	}
}