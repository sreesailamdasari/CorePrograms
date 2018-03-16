package com.core.java8;

public interface StaticIntreface {

	default void defaultPrint(String str) {
		if (!staticIsNull(str))
			System.out.println("StaticIntreface Print::" + str);
	}

	static boolean staticIsNull(String str) {
		System.out.println("Interface Null Check");
		return str == null ? true : "".equals(str) ? true : false;
	}

//Runnable
}
