package com.veera.java5.operators;

public class ShiftOperators {
	
	public static void main(String[] args) {
		int a=10;
		int b=2;
		System.out.println("Initial values of a, b - "+a+", "+b);
		System.out.println("left shift - "+(a<<b));
		System.out.println("right shift - "+(a>>b));
		System.out.println("unassigned  right shift - "+(a>>>b));
	}

}
