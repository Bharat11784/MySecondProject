package Casting;

public class OverridingParentCasting {
	
	String firstname;
	String lastname;
	static int salary=100000;
	
	OverridingParentCasting(){
		System.out.println("parent class constructor");
		this.firstname="bharat";
		this.lastname="patil";
	}
	
	public int salaryofEmp(int a) {
		
		System.out.println("parent class:" +a);
		return salary;
	}

}
