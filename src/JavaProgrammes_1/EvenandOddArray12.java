package JavaProgrammes_1;

public class EvenandOddArray12 {
	
	public static void main(String[]args) {
		
		int a[]= {3,2,5,8,1,6};
		
		System.out.println("even numbers");
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) 
				System.out.println(a[i]);
		}
		
		System.out.println("odd no");
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
	}

}
