package com.functionalInterface;

public class MainMethod {

	public static void main(String[] args) {

		AdditionImpl additionImpl = new AdditionImpl();
		additionImpl.add();

		Addition addition = new AdditionImpl();
		addition.add();

		Addition addition1 = () -> System.out.println("Hi");
		addition1.add();
	}
}
