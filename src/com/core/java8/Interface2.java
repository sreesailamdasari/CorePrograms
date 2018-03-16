package com.core.java8;

public interface Interface2 {
	public void m2();

	default void log(String str) {
		System.out.println("From Interface2 : " + str);
	}
}
