package JavaProgrammes_2;

public class LengthofString1 {
	
	public static void main(String[]args) {
		
		String x="bharat";
		
		x=x.concat("\0");
		
		char a[]=x.toCharArray();
		
		int i=0;
		int count=0;
		
		while(a[i]!='\0') {
			
			++count;
			++i;
			
		}
		
		System.out.println(count);
	}

}
