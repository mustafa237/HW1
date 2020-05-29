package mustafa;

interface Variable{
	int a = 5; 	// Interface variables automatically set to 
				// public static final variables which means constants.
}

public class Q6 {
	public final static double PI = 3.14;
	int instanceVar;
	
	public Q6(int instanceVar){
		this.instanceVar = instanceVar;
	}
	public int Method() {
		int localVar = 27;
		return localVar;
	}
	public static void main(String[] args) {
		System.out.println(Variable.a ); 	// interface variable accessible globally
		
		System.out.println(Q6.PI); 			// class variable accessible globally
		
		Q6 q6 = new Q6(1);
		System.out.println(q6.instanceVar); // Instance variables can be accessed globally
											// if they have not been set to private.
		
		System.out.println(q6.Method()); 	// Method variables can only be accessed by methods
											// They dont exist after methods complete executing
	}

}
