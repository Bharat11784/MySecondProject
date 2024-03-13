package JavaProgrammes_1;

public class Swaptwono1 {
	
	public static void main(String[]args) {
		
		int a=10;
		int b=20;
	//	int temp;
		
		System.out.println("before swap"+a+" "+b);
		
	//	temp=a;
	//	a=b;
	//	b=temp;
		
		
	//	System.out.println("after swap"+a+"  "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap"+a+"  "+b);
	}

}
