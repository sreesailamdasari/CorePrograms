package com.core.oops;

public class SingleTone {

	private static SingleTone singletone;

	private SingleTone() {

	}

	public static SingleTone getInstance() {
		if (singletone == null) {
			singletone=new SingleTone();
		}
			return singletone;
	}

	public static void main(String[] args) {
		SingleTone st=SingleTone.getInstance();
		System.out.println(st);
		SingleTone st1=SingleTone.getInstance();
		System.out.println(st1==st);
		st=null;
		SingleTone st2=SingleTone.getInstance();
		System.out.println(st2);
		
	}
}
