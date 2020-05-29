package mustafa;
/*public interface must be defined in its own file eliminates (B)
public interface one{
	
}
*/

interface two{
	
}
interface three{
	
}



// For testing purpose -> without class
/*

public class Q9 {

	public static void main(String[] args) {
		

	}

}*/
class NonPublicClass{
	// Allowed
}
class NonPublicClass2{
	// more than one Allowed eliminates (A)
}

public class Q9 {// Added after test //Also works without public class

	public static void main(String[] args) {
		
		//Must have at least one class ----->
		
	}

}

/* 
 * Additional public classes must be defined in their own file error. 
 * Only one public class. Eliminates (C)   <------
public class AnotherClassInQ9DotJava{
	
}
*/