package JavaProgrammes_1;

public class MaxandMinArray15 {
	
	public static void main(String[]args) {
		
		int a[]= {20,10,50,80,30};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
		
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			
			if(a[i]<min)
				min=a[i];
		}
		
		System.out.println(min);
	}

}
