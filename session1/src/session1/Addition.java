package session1;

public class Addition {
	
	public void add(int a,int b) {
		int c = a + b;
		System.out.println("c = "+c  );
	}
	
	public int add(int a,int b,int c) 
	{
		return(a+b+c);
	}

	public void add(int a,int b,int c,int d) {
		
		System.out.println("Addition " +(a+b+c+d) );
	}
	
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(12, 13);
		System.out.println(a.add(1, 3, 5));
		a.add(1, 23, 4, 5);
	}


}
