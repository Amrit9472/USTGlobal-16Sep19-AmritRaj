
public class TestC {

	public static void main(String[] args) {


		Person.color = "white";
		Person.sleep();

		System.out.println("Person color "+Person.color);
		System.out.println("================================");
		Person p1 = new Person();
		p1.age = 20;
		p1.name = "Amrit Raj";

		System.out.println("Age  is"+p1.age);
		System.out.println("Name is "+p1.name);
		p1.color ="black";
		p1.sleep();

		System.out.println("================================");
		Person p2 = new Person();
		p2.age = 18;
		p2.name = "Prateek";

		System.out.println("Age  is"+p2.age);
		System.out.println("Name is "+p2.name);
		p2.color ="black";
		p2.sleep();


	}

}
