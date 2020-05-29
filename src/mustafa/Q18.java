package mustafa;

public class Q18 {

	public static void main(String[] args) {
		String tree = "pine";
		int count = 0;
		if (tree.equals("pine")){
			@SuppressWarnings("unused")
			int height = 55;
			count +=1;
		}
		System.out.print(
				//height <-- height has not been defined at this scope.
				+ count);

	}

}
