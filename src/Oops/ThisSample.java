package Oops;

public class ThisSample {
	
	String firstname;
	String lastname;
	int rollno;
	
	
	ThisSample(String firstname, String lastname, int rollno){
		
		this.firstname=firstname;
		this.lastname=lastname;
		this.rollno=rollno;
	}
	
	public void thissamplemethod1() {
		
		System.out.println("thissamplemethod1");
		this.thissamplemethod2();
	}
	
	
	public void thissamplemethod2() {
		System.out.println("thissamplemethod2");
	}
	
	public static void main(String[]args) {
		
		ThisSample jm=new ThisSample("bharat","patil",1);
		
		System.out.println(jm.firstname+" "+jm.lastname+" "+jm.rollno);
		jm.thissamplemethod1();
		
		
	}

}
