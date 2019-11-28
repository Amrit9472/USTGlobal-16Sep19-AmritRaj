
public class TestA {
	public static void main(String[] args) {
		Pen p =	new Pen();
		
		p.cost = 100;
		p.color = "Red";
		p.brand ="parker";
		
		System.out.println("Cost is " +p.cost);
		System.out.println("Coloe is " +p.color);
		System.out.println("Brand is "+p.brand);
		
		p.write();
		
		System.out.println("**************************");
		Van v = new Van();
		
		v.color = "Blue";
		v.cost = 5000000;
		
		System.out.println("Van cost is "+v.cost);
		System.out.println("Van col is "+v.color);
		
		Van v1 = new Van();
		
		v1.color = "Red";
		v1.cost = 4000000;
		
		System.out.println("Van col is "+v1.color);
		System.out.println("Van cost is "+v1.cost);
		
		v.move();
	}

}
