package Oops;

public class ParentClassSuper {
	
	String firstname;
	int salary=1000;
	
	ParentClassSuper(){
		System.out.println("parent class constructor called");
		
		this.firstname="Parentclassfirstname";
	}
	
	public int classsalarymethod() {
		
		System.out.println("parentclasssalary: " +salary);
		return this.salary;
	}

}
