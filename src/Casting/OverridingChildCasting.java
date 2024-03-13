package Casting;

public class OverridingChildCasting extends OverridingParentCasting {
	
	String firstname;
	String lastname;
	
	OverridingChildCasting(String firstname, String lastname){
		
		System.out.println("child class constructor");
		
		this.firstname=firstname;
		this.lastname=lastname;
	}
	
	
	public int salaryofEmp(int a) {
		
		System.out.println("salary of child");
		return 200000;
	}
	
	public static void main(String[]args) {
		
		//up casting//
		
		OverridingParentCasting jkl=new OverridingChildCasting("savita","p");
		
		// down casting//
		
		OverridingChildCasting zxc=(OverridingChildCasting)jkl;
		
		System.out.println(jkl.firstname+" "+jkl.lastname);
		
		System.out.println(zxc.firstname+" "+zxc.lastname);
		
		
		
	}
	

}
