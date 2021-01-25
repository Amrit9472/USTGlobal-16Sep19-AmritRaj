package session1;

public class Date {

	int dd,mm,yy;
	
	public void DateIn() 
	{
		System.out.println("comming from first method");
		dd = 22;
		mm = 05;
		yy = 2021;
				
	}
	
	public void show() {
		System.out.println("date = ["+dd+"/"+mm+"/"+yy+"]");
		
	}
	
	public static void main(String[] args) {
		Date d = new Date();
		d.DateIn();
		d.show();
	}
	
	
}
