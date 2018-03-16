package com.core.java8;

public interface Interface1 {
	public void m1();

	default void log(String str) {
		System.out.println("From Interface1 log : " + str);
	}

}
