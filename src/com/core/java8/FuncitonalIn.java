package com.core.java8;

import java.util.function.Consumer;

@FunctionalInterface
public interface FuncitonalIn {
	public void m3();
	// public void m4();

	default void m1() {
		System.out.println("Funcitonal interface message");
	}

}
