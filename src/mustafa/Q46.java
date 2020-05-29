package mustafa;

public class Q46 { // as Bicycle class
	String color = "red";
	private void printColor(String color){
		color="purple";
		System.out.println(color);
		
		
	}
	

	public static void main(String[] args) {
		new Q46().printColor("blue");
		new Q46().printColor("turquoise");

	}

}
