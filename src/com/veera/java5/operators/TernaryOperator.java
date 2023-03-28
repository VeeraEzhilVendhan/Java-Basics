package com.veera.java5.operators;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		int a=5;
		int b=7;
		int i=0;
		int c=a<b?(a<i?i:a):b;
		System.out.println(c);
		
		int a1=341;
		int a2=451;
		int a3=304;
		
		String highValue=a1>a2?(a1>a3?"a1":"a3"):(a2>a3?"a2":"a3");
		System.out.println(highValue);
		
	}

}
