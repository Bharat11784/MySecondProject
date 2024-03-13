package JavaProgrammes_2;

public class Perfectno2 {
	
	public static void main(String[]args) {
		
		int num=28;
		int sum=0;
		
		for(int i=1;i<num;i++) {
			
			if(num%i==0)
				sum=sum+i;
		}
		
		if(num==sum) {
			
			System.out.println("its perfect");
		}
		else {
			
			System.out.println("its not perfect");
		}
	}

}
