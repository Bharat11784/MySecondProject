package JavaProgrammes_2;

public class Perfectno {
	
	public static void main(String[]args) {
		
		
		int num=3;
		
		int sum=0;
		
		for(int i=1;i<num;i++) {
			
			if(num%i==0) 
				sum=sum+i;
		}
		
		if(num==sum) {
			System.out.println("its prime no");
		}
		
		else {
			System.out.println("not prime");
		}
	}

}
