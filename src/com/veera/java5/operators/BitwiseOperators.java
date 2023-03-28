package com.veera.java5.operators;

public class BitwiseOperators {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("bitwise AND & of "+a+","+b);
		System.out.println("binary of a - "+getBinary(a));
		System.out.println("binary of b - "+getBinary(b));
		System.out.println("Answer - "+(a&b));
		
		System.out.println("bitwise OR of "+a+","+b);
		System.out.println("binary of a - "+getBinary(a));
		System.out.println("binary of b - "+getBinary(b));
		System.out.println("Answer - "+(a|b));
		
		System.out.println("bitwise EOR of "+a+","+b);
		System.out.println("binary of a - "+getBinary(a));
		System.out.println("binary of b - "+getBinary(b));
		System.out.println("Answer - "+(a^b));
		
		System.out.println("bitwise Complement of "+a);
		System.out.println("binary of a - "+getBinary(a));
		System.out.println("Answer - "+(~a));
	}
	
	public static String getBinary(int decimal) {
		String binary="";
		while(decimal>=2) {
			int reminder=decimal%2;
			decimal/=2;
			binary=binary+reminder;
		}
		binary=binary+""+decimal;
		String actualBinary="";
		for(int i=binary.length()-1;i>=0;i--) {
			actualBinary=actualBinary+binary.charAt(i);
		}
		return actualBinary;
	}

}
