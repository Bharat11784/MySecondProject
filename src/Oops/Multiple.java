package Oops;



interface men{
	
	public void menwalk();
}

interface women{
	
	public void womenwalk();
}


class Human implements men,women{
	
	public void menwalk() {
		System.out.println("different menwalk");
	}
	
	public void womenwalk() {
		System.out.println("different womenwalk");
	}
}
public class Multiple {

	public static void main(String[]args) {
		
		Human gh=new Human();
		gh.menwalk();
		gh.womenwalk();
	}
	
}
