package com.core.java8;

public class FunctionalInterfaceImpl implements FuncitonalIn {

	@Override
	public void m3() {
		System.out.println("FunctionalInterface impl");

	}

	public static void main(String[] args) {
		FunctionalInterfaceImpl functionalInterfaceImpl = new FunctionalInterfaceImpl();

		FuncitonalIn in = () -> System.out.println("from me");
//		in.m3();
		in.m1();
	}
}
