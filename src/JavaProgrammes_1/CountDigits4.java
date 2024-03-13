package JavaProgrammes_1;

public class CountDigits4 {
	
	public static void main(String[]args) {
		
		int num=618534;
		
		int count=0;
		
		while(num>0) {
			
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
