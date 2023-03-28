package coding.veera.java2.variables;

public class VariableTypes {
	
	int instaceVariable=1;
	static int staticVariable=2;
	
	public static void main(String[] args) {
		int localVariable=3;
		VariableTypes v=new VariableTypes();
		System.out.println("Instace Variable - "+v.instaceVariable);
		System.out.println("Static Variable - "+staticVariable);
		System.out.println("Local Variable - "+localVariable);
		System.out.println("Changing values for instace and static variable from other class.....");
		new VariableAccess().changingValues();
		System.out.println("Instace Variable - "+v.instaceVariable);
		System.out.println("Static Variable - "+staticVariable);
	}
	
	


}