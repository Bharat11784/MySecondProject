package Oops;

public class OverriddingClassParent {
	
	String firstname;
	static int salary=1000;
	
	OverriddingClassParent(){
		System.out.println("parent constructor called");
		this.firstname="parentclass name is bharat";
	}
	
	public int salaryofEmp(int a) {
		
		System.out.println("parent class" +a);
		
		return salary;
	}

}
