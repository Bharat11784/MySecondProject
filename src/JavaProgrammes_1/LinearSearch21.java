package JavaProgrammes_1;

public class LinearSearch21 {
	
	public static void main(String[]args) {
		
		int a[]= {29,80,40,30,60};
		
		int search=80;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			
			if(search==a[i]) {
				
				System.out.println("found:" +i);
				flag=true;
			}
		}
		
		if(flag==false) {
			System.out.println("not found");
		}
	}

}
