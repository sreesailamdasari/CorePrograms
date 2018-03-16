package com.core.java8;

public class InterfaceImpl implements Interface1, Interface2 {

	@Override
	public void m2() {
	}

	@Override
	public void m1() {
	}

	@Override
	public void log(String str) {
		System.out.println("from " + str);
		Interface2.super.log(str);
	}

	public static void main(String[] args) {
		InterfaceImpl ii = new InterfaceImpl();
		ii.log("Hi");
		FuncitonalIn functionalInterface = () -> System.out.println("from functional message");
		functionalInterface.m3();
	}

}
