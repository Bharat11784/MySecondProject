package Oops;


class animal{
	
	public void animaleat() {
		System.out.println("animaleat food");
	}
}

class dog extends animal{
	
	public void dogeat() {
		System.out.println("dogeat food");
	}
}

public class SingleLevel {
	
	public static void main(String[]args) {
		
		dog fgh=new dog();
		fgh.animaleat();
		fgh.dogeat();
	}

}
