package JavaProgrammes_1;

public class Factorial11 {
	
	public static void main(String[]args) {
		
		int num=5;
		long factorial=1;
		
		for(int i=1;i<=5;i++) {
			
			factorial=factorial*i;
		}
		
		System.out.print(factorial);
	}

}
