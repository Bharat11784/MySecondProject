package Oops;

public class OverloadingSample {
	
	public int addition(int a, int b) {
		
		int sum=a+b;
		return sum;
	}
	
	public int addition(int a, int b, int c) {
		
		int sum=a+b+c;
		return sum;
		
	}
	
	
	public float addition(float a, float b) {
		
		float sum=a+b;
		return sum;
	}
	
	
	public static void main(String[]args) {
	OverloadingSample hj=new OverloadingSample();
	
	System.out.println(hj.addition(10, 20));
	System.out.println(hj.addition(10,20,30));
	System.out.println(hj.addition(10.2f, 20.8f));
	
	
	}
}
