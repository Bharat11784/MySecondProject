package JavaProgrammes_2;

public class Palindrome5 {
	
	public static void main(String[]args) {
		
		String x="to hOt TO Cold";
		
		x=x.replace(" ", "");
		x=x.toLowerCase();
		
		char y[]=x.toCharArray();
		
		int size=y.length;
		
		char a[]=new char[size];
		
		int i=0;
		
		while(i!=size) {
			
			a[size-1-i]=y[i];
			
			i++;
		}
		System.out.println(y);
		System.out.println(a);
		
		i=0;
		while(i!=size) {
			if(a[i]!=y[i]) {
				System.out.println("not palindrome");
				System.exit(i);
			}
			else
			{
				i++;
				continue;
			}
		}
		
		System.out.println("its palindrome");
	}

}
