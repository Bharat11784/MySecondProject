package Oops;


class vehicle{
	
	public void vehicletype() {
		
		System.out.println("vehicletype is fourwheeler");
	}
}

class car extends vehicle{
	
	public void cartype() {
		System.out.println("car is ford");
	}
}

class suv extends vehicle{
	
	public void suvtype() {
		
		System.out.println("suv is ecosport");
	}
}

public class Hierarchical {
	
	public static void main(String[]args) {
		
		car df=new car();
		suv as=new suv();
		
		df.cartype();
		df.vehicletype();
		as.suvtype();
		as.vehicletype();
		
	}

}
