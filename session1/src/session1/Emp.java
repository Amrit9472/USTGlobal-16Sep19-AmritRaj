package session1;

public class Emp {
	

		private int id;
		private String empNm; 
		private float empSal; 
		
		public Emp() 
		{
//			this(1, "xysxz",3333.33f);
			System.out.println("Default const invoked");
			id = 1;
			empNm = "Amrit";
			empSal = 26770.78f;
			
					
		}
		
		public Emp(int id, String empNm, float empSal) 
		{
			System.out.println("pramet const");
			this.id = id;
			this.empNm = empNm;
			this.empSal = empSal;
			
			
		}
		public String toString() 
		{
			return" Employee = ["+id+" ,"+empNm+","+empSal+"]";
			
		}
		
		public static void main(String[] args) 
		{
			Emp e = new Emp();
			System.out.println(e);
			
//			Emp e1= new Emp( 22 ,"Ram",4444.23f);
//			System.out.println(e1);
//			    
		}
	}



