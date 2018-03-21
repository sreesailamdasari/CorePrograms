package com.core.util;

public class GarbageCollector {
	public static void main(String[] args) {
		GarbageCollector gc = new GarbageCollector();
		GarbageCollector gc1 = new GarbageCollector();
		gc = null;
		System.gc();
		System.out.println("before finally");
//		gc1=null;
//		System.out.println(gc1);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method");
	}
}
