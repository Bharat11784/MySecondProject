package JavaProgrammes_2;

public class primeno {
	
	public static void main(String[]args) {
	
	int num=5;
	int count=0;
	
	
	if(num>1) {
		
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) 
				count++;	
		}
		
		if(count==2) {
			System.out.println("its prime no");
		}
		
		else {
			
			System.out.println("not prime");
		}
	
	}
	else {
		
		System.out.println("not prime");
	}

}
}
