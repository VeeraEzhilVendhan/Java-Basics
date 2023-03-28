package coding.veera.java2.variables;

public class VariableAccess {
	
	public static void main(String[] args) {
		VariableTypes v=new VariableTypes();
		System.out.println(v.instaceVariable);
		System.out.println(VariableTypes.staticVariable);
	}
	
	public void changingValues() {
		VariableTypes v=new VariableTypes();
		v.instaceVariable=11;
		VariableTypes.staticVariable=12;
	}

}
