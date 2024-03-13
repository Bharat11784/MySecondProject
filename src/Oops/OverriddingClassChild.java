package Oops;

public class OverriddingClassChild extends OverriddingClassParent{
	
	
	String firstname;
	String lastname;
	
	OverriddingClassChild(String firstname, String lastname){
		
		this.firstname=firstname;
		this.lastname=lastname;
	}
	
public int salaryofEmp(int a) {
		
		System.out.println("child class");
		
		return 2000;
	}

public static void main(String[]args) {
	
	OverriddingClassChild vb=new OverriddingClassChild("bharat","patil");
	System.out.println(vb.firstname+" "+vb.lastname);
	

	System.out.println(vb.salaryofEmp(20));
}
	

}
