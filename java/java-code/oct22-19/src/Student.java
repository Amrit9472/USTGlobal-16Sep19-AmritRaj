
public class Student {
	int id;
	String name;
	int age;
	String gen;
	String city;
	 
	Student(int id,String name,int age,String gen,String city ){
		this.name=name;
		this.age=age;
		this.id=id;
		this.city=city;
		this.gen=gen;
		
	}
	 void display() {
		 System.out.println("Name of Studen is "+name);
		 System.out.println("Age of student is "+age);
		 System.out.println("Id of student is "+id);
		 System.out.println("City of student is "+city);
		 System.out.println(" Gender  is "+gen);
	 }
 public static void main(String[] args) {
	 Student s1 = new Student(101,"Amrit",22,"male","delhi");
	 s1.display();
	 System.out.println("=================================");
	 
	 Student s2 = new Student(102,"Kuku",24,"male","delhi");
	 s2.display();
	 System.out.println("=================================");
	 Student s3 = new Student(103,"Rajeet",29,"male","delhi");
	 s3.display();
	 System.out.println("=================================");

	 Student s4 = new Student(104,"gajender",30,"male","delhi");
	 s4.display();
	 System.out.println("=================================");

	 Student s5 = new Student(105,"Guru",33,"male","delhi");
	 s5.display();
	 System.out.println("=================================");

	 Student s6 = new Student(106,"Avinash",22,"male","delhi");
	 s6.display();
	 System.out.println("=================================");

	 Student s7 = new Student(107,"Abhi",24,"male","delhi");
	 s7.display();
	 System.out.println("=================================");

	 Student s8 = new Student(108,"prateek",18,"male","delhi");
	 s8.display();
	 System.out.println("=================================");

	 Student s9 = new Student(109,"shekhar",60,"male","delhi");
	 s9.display();
	 System.out.println("=================================");

	 Student s10 = new Student(110,"shanker",59,"male","delhi");
	 s10.display();
	 
	
}
}
