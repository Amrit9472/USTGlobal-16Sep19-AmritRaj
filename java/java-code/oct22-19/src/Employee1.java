
public class Employee1 {
	String name;
	int eid;

	public Employee1(String empname,int empid) {
		this.name = empname;
		this.eid = empid;
	}
	void printDetails() 
	{
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+eid);
		this.sayHello();
	}
	void sayHello() {
		System.out.println("hello " +name+" welcome to UST global company");
	}
	
	public static void main(String[] args) {
		Employee1 e1 = new Employee1("Amrit",123);
		e1.printDetails();
		Employee1 e2 = new Employee1("Ankit ",321);
		e2.printDetails();
		Employee1 e3 = new Employee1("Taygi",234);
		e3.printDetails();
	}

}
