package JavaProgrammes_1;

public class Counteve_odd_digits5 {
	
	public static void main(String[]args) {
		
		int num=524631;
		
		int evncount=0;
		int oddcount=0;
		
		while(num>0) {
			
			int rem=num%10;
			
			if(rem%2==0) {
				
				evncount++;
			}
			else {
				oddcount++;
			}
			
			num=num/10;
		}
		
		System.out.println(evncount);
		System.out.println(oddcount);
	}

}
