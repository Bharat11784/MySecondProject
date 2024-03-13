package JavaProgrammes_1;

public class Missingno14 {

	public static void main(String[]args) {
		
		int a[]= {1,2,4,5};
		
		int sum1=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum1=sum1+a[i];
		}
		
		System.out.println(sum1);
		
		int sum=0;
		
		for(int i=1;i<=5;i++) {
			
			sum=sum+i;
		}
		
		System.out.println(sum);
		
		System.out.println(sum-sum1);
	}
}
