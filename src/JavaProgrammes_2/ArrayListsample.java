package JavaProgrammes_2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListsample {
	
	public static void main(String[]args) {
		
		Student s1=new Student(111,"navami",8);
		Student s2=new Student(112,"mahanth",5);
		Student s3=new Student(113,"savita",35);
		Student s4=new Student(114,"bharat",39);
		
		ArrayList<Student> jk=new ArrayList<Student>();
		
		jk.add(s4);
		jk.add(s3);
		jk.add(s1);
		jk.add(s2);
		
		
		Iterator itr=jk.iterator();
		
		
		for(Student u:jk) {
			
			System.out.println(u.rollno+" "+u.age+"  "+u.name);
		}
		
	}

}


class Student{
	
	int rollno;
	String name;
	int age;
	
	
	public Student(int rollno, String name,int age) {
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}