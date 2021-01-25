package assigments1.qes3;

public class Employee {
	
	int empId;
	String name;
	int salary;
	
	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		if(this.empId == e.empId) {
			System.out.println("empid "+e.empId+"allready exits");
			return false;
		}
		if (obj == null)
			return  false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Employee [empid ="+ empId +",name = "+name+" , salary ="+salary+" ]";
				
	}

}
