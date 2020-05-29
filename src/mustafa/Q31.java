package mustafa;

public class Q31 {// Age class
	
	private int age;
	final int end;
	
	public Q31(int age){
		age=5;
		end=age;
		setAge(age);
	}
	public Q31(String year){
		end=age;
		setAgeFromYear(year);
	}

	public void setAgeFromYear(String year) {
		setAge(2020 - Integer.parseInt(year));
		
	}
	public void setAge(int age) {
		this.age=age;
	}

	public static void main(String[] args) {

		Q31 one = new Q31(25);
		System.out.println(one.end);
		Q31 two = new Q31("1995");
		System.out.println(two.age);

	}

}
