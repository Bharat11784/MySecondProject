package JavaProgrammes_2;

public class DeleteOccurence {
	
	public static void main(String[]args) {
		
		String x="SPIDERSLIES";
		
		char y[]=x.toCharArray();
		
		int size=y.length;
		
		char key='E';
		
		int i=0;
		
		String res="";
		while(i!=size) {
			
			if(y[i]!=key) {
				
				res=res+y[i];
			}
			++i;
		}
		
		System.out.println(res);
	}

}
