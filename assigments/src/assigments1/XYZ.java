package assigments1;

public class XYZ {
	static int totalPrice = 0;
	
	
	public static void main(String[] args) {
		
		OneBHK t1[]= {
				new TwoBHK(456.77, 236.67, 4440.00f, 2222.00),
				new TwoBHK(4516.77, 2336.67, 14440.00f, 42222.00),
				new TwoBHK(4562.77, 2236.67, 41440.00f, 32222.00),

				
				
		};
		
		for(OneBHK b1:t1 ) {
			totalPrice +=b1.price;
			b1.show();
			
					
		}
		System.out.println("total prices of three falt are = "+totalPrice+"");
		
	}

}
