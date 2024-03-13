package Oops;


class pen{
	
	public void pencolour() {
		
		System.out.println("pen colour is blue");
	}
	
}

class ballpen extends pen{
	
	public void ballpencolour() {
		
		System.out.println("ballpen colour is red or black");
	}
}

class gelpen extends ballpen{
	
	public void gelpencolour() {
		
		System.out.println("gelpen colour is green");
	}
}

public class MultiLevel {
	
	public static void main(String[]args) {
		
		ballpen op=new ballpen();
		gelpen po=new gelpen();
		
		op.ballpencolour();
		op.pencolour();
		po.gelpencolour();
		
		
	}

}
