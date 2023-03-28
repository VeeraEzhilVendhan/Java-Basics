package coding.veera.java3.const_literals;

public class Constants {
	
	public static final double PI=3.14;
	
	public enum Color {Red,Green}
	
	public static void main(String[] args) {
		System.out.println(Constants.PI);
		
		for(Color c:Color.values()) {
			System.out.println(c);
		}
	}

}
