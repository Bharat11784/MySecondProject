package Oops;

public class ChildClassSuper extends ParentClassSuper {
	
	String firstname;
	String lastname;
	int rollno;
	
	ChildClassSuper(String firstname,String lastname,int rollno){
		
		System.out.println("child class constructor");
		
		this.firstname=firstname;
		this.lastname=lastname;
		this.rollno=rollno;
		
	}
	
	
	public void childclassmethod() {
		
		System.out.println("parent class name: " +super.firstname);
	}
	
	public static void main(String[]args) {
		
		ChildClassSuper fg=new ChildClassSuper("bharat","patil",1);
		System.out.println(fg.firstname+" "+fg.lastname+" "+fg.rollno);
		fg.childclassmethod();
		fg.classsalarymethod();
	}
	

}
