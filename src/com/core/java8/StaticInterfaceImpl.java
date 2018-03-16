package com.core.java8;

public class StaticInterfaceImpl implements StaticIntreface {

	public boolean staticIsNull(String str) {
		System.out.println("StaticImpl Null Check");

		return str == null ? true : false;
	}

	public static void main(String[] args) {
		StaticInterfaceImpl impl = new StaticInterfaceImpl();
		
		impl.defaultPrint("");
		impl.staticIsNull("msg");
	}
}
