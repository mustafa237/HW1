package mustafa;

public class Q21 {
	private static int yesterday = 1;
	int tomorrow = 10;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Q21 tolls = new Q21();
		
		System.out.print(Integer.toString(tolls.tomorrow) +
				", " + 
				Integer.toString(tolls.yesterday));// can be accessed as Q21.yesterday
		
	}
}
