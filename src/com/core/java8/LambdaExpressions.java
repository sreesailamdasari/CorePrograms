package com.core.java8;

public class LambdaExpressions {
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		LambdaExpressions le = new LambdaExpressions();
		GreetingService service = new GreetingService();
//		le.greet(service);
		Greeting myLambdaFunction = () -> System.out.println("Lambda Hello World!");
		myLambdaFunction.perform();

	}

}
