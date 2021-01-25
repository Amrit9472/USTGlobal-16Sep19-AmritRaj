package session1;

public class Employee {

	private int id;
	private String empNm;
	private float empSal;
	
	public Employee() 
	{
		System.out.println("Default const invoked");
		id = 1;
		empNm = "Amrit";
		empSal = 26770.78f;
		
				
	}
	
	public Employee(int eid, String nm, float sal) 
	{
		System.out.println("pramet const");
		id = eid;
		empNm = nm;
		empSal = sal;
		
		
	}
	public String toString() 
	{
		return" Employee = ["+id+" ,"+empNm+","+empSal+"]";
		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e);
		Employee e1= new Employee( 22 ,"Ram",4444.23f);

		System.out.println(e1);
		    
	}
}
