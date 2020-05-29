package mustafa;

public class Q10 {
	static String weight = "A lot";
	/* def */ double ageMonths = 5, ageDays = 2; 
	private static boolean success = true; 
	
	public static void main(String[] args) {
		final String retries = "1"; // Local variable
		//p1
		String string = weight + ", " + // Class variable
						//Double.toString(ageMonths) + ", " + // Instance variable
						//Double.toString(ageDays) + ", " + // Instance variable
						success + ", " + // Class variable
						retries; // Local variable
		System.out.print(string);

	}

}
