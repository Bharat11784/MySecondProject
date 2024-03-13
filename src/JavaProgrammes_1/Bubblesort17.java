package JavaProgrammes_1;

import java.util.Arrays;

public class Bubblesort17 {
	
	public static void main(String[]args) {
		
		int a[]= {3,1,8,2,4};
		
		System.out.println(Arrays.toString(a));
		
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-1;j++) {
				
				if(a[j]>a[j+1]) {
					
					int tem=a[j];
					a[j]=a[j+1];
					a[j+1]=tem;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
