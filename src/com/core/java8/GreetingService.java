package com.core.java8;

public class GreetingService implements Greeting {

	@Override
	public void perform() {
		System.out.println("Service: Hello World!");
	}

}
