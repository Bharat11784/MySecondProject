package JavaProgrammes_2;

public class StringInteger {
	public static void main(String[]args) {
		
		String x="674325";
		
		char y[]=x.toCharArray();
		
		int size=y.length;
		
		int i=0;
		
		while(i!=size) {
			
			if(y[i]>=0&&y[i]<=9) {
				System.out.println("not string");
				System.exit(0);
			}
			else {
				i++;
			}
		}
		
		System.out.println("its integer");
		
	}

}
