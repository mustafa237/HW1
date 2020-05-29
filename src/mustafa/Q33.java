package mustafa;

public class Q33 {// Age class from Q31 with extra final int end
	
	public int age;
	final int end;
	
	public Q33(int age){
		age=5;
		end=age;// <--- TEST
		setAge(age);
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	
	public static void main(String[] args) {
		Q33 one = new Q33(25);
		System.out.println(Integer.toString(one.end) +" " + one.age );
	}

}
