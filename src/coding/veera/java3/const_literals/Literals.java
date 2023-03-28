package coding.veera.java3.const_literals;

import java.util.Scanner;

public class Literals {
	
	public static void main(String[] args) {
		
		int decimal=5;
		int octal=05;
		int hexaDecimal=0x5;
		int binary=0b101;
		float floatingNum=0.5f;
		double doubleNum=0.5d;
		char newLine='\n';
		char tab='\t';
		char blankSpace='\b';
		char backSlash='\\';
		char carriageReturn='\r';
		char formFeedNewPage='\f';
		String nullString=null;
		Class<Scanner> classLiteral=Scanner.class;
		boolean booleanLiteral=true;
		
		System.out.println("Decimal Literal "+decimal);
		System.out.println("Octal Literal "+octal);
		System.out.println("HexaDecimal Literal "+hexaDecimal);
		System.out.println("Binary Literal "+binary);
		System.out.println("Floating Literal "+floatingNum);
		System.out.println("Double Literal "+doubleNum);
		System.out.println("new line literal "+newLine+"additional string");
		System.out.println("blank space literal"+blankSpace+"additional string");
		System.out.println("backslash literal"+backSlash);
		System.out.println("tab literal"+tab+"additional string");
		System.out.println("carriage return literal"+carriageReturn+"additional string");
		System.out.println("form feed literal"+formFeedNewPage+"additional string");
		System.out.println("Null Literal "+nullString);
		System.out.println("Boolean Literal "+booleanLiteral);
		System.out.println("Class Literal "+classLiteral);
		
	}
	

}
