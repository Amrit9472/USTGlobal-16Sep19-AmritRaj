package assigments1;

public class OneBHK {

	double roomArea;
	double hallArea;
	float price;
	
	public OneBHK(double roomArea, double hallArea, float price) {
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
	}
	
	public void show() {
		System.out.println("Room Area = "+roomArea+"/ hallArea ="+hallArea+"/ price = "+price+"");
	}
	
	
	
	
}
