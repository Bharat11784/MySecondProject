package Oops;

public class StaticMethod {
	
	static String collegeName;
	
	String fName;
	String lName;
	int rollNo;
	
	
	public StaticMethod(String fName, String lName, int rollno) {
		
		System.out.println("parameterized constructor called");
		
		this.fName=fName;
		this.lName=lName;
		this.rollNo=rollno;
	}
	
	static {
		System.out.println("before main method it is called");
		collegeName="klsvdit";
	}
	
	public static void main(String[]args) {
		
		StaticMethod hj=new StaticMethod("bharat","patil", 1);
		
		System.out.println(hj.fName+" "+hj.lName+" "+hj.rollNo);
		
		System.out.println(StaticMethod.collegeName);
		
		
	}

}
