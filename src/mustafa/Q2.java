package mustafa;

public class Q2 {
	public class Metal {
		public double weight;
		public String color;
		
		public Metal(double weight, String color){
			this.weight = weight;
			this.color = color;
		}
	}
	
	public class Gold extends Metal {
		public double hue;
		
		public Gold(double hue, double weight, String color){
			super(weight,color);
			this.hue = hue;
		}
		
		public String toString() {
			return "This piece of " + this.color +" gold is weighs " 
					+ this.weight + "grams and it's "	+ this.hue + " carats. ";
		}
	}
	
	public class Silver extends Metal {
		public double luster;
		
		public Silver(double luster, double weight, String color){
			super(weight,color);
			this.luster = luster;
		}
	}
	
	public static void main(String[] args) 	{
		Gold gold = new Q2().new Gold(24,100,"Yellow");
		System.out.println(gold.color);
 
		try { 
			//System.out.println(gold.luster);
		} catch (Exception e) { 
		    System.out.println(e);
		}
	}
}
