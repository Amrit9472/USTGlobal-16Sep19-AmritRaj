package assigments1.qes3;

public class XYZ {
	
	public static void main(String[] args) {
		Employee e[] = {
				new Employee(1, "amrit ",40000),
				new Employee(2, "Raj ",40000),
				new Employee(3, "Singh ",40000),
				new Employee(4, "Rahul ",40000),
				new Employee(5, "shivam ",40000),
				
				
		};
		for (int i = 1; i < e.length; i++) {
			e[i].equals(e[i-1]);
		}
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
			
		}
	}

}
