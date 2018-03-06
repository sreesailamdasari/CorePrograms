package com.core.collections.map;

import java.util.Hashtable;
import java.util.WeakHashMap;

class Test {

	@Override
	public String toString() {
		return "temp";
	}

	protected void finalize() throws Throwable {
		System.out.println("finalize");
	}

}

public class WeakHashMapProg {
	public static void main(String[] args) throws InterruptedException {
		WeakHashMap<Integer, Object> weakHashMap = new WeakHashMap<>();
		Test test = new Test();
		weakHashMap.put(1, test);
		System.out.println(weakHashMap);
		test = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(weakHashMap);
	}

}
