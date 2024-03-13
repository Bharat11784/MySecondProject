package Oops;

public class AbstractExtendingClass extends AbstractClassSample{
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int addition1(int a, int b) {
		return a+b;
	}
	
	public int addition3(int a, int b) {
		return a+b;
	}
	
	public int addition4(int a, int b, int c) {
		return a+b+c;
	}
	
	
	public static void main(String[]args) {
		
		AbstractClassSample bsnm=new AbstractExtendingClass();
		
		System.out.println(bsnm.addition(20, 30));
		System.out.println(bsnm.addition1(50, 60));
		System.out.println(bsnm.addition3(80, 90));
		
		AbstractExtendingClass nmbs=new AbstractExtendingClass();
		System.out.println(nmbs.addition4(40, 70, 90));
	}
}
