package assigments1;

public class TwoBHK extends OneBHK {
	double room2Area;
	
	public TwoBHK(double roomArea, double hallArea, float price,double room2Area) {
		super(roomArea, hallArea, price);
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
		this.room2Area = room2Area;
		// TODO Auto-generated constructor stub
	}

//	public TwoBHK(double roomArea, double hallArea, float price, ) 
//	{
//		super(roomArea, hallArea, price);
//		
//	}
	
	public void show() {
		System.out.println("Room Area = "+roomArea+"/ hallArea ="+hallArea+"/ price = "+price+" /Room Area2 ="+room2Area+"");
	}
	
	

}
