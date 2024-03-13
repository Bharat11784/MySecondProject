package JavaProgrammes_2;

public class CountVowels {

	public static void main(String[]args) {
		
		String x="BHARATKUMAR'S PATIL";
		
		char y[]=x.toCharArray();
		
		int size=y.length;
		
		int vowelcount=0;
		
		int consonants=0;
		int symbol=0;
		
		int i=0;
		
		while(i!=size) {
			if(y[i]>='A'&&y[i]<='Z') {
				
				if(y[i]=='A'||y[i]=='E'||y[i]=='I'||y[i]=='O'||y[i]=='U') {
					
					++vowelcount;
				}
				else {
					++consonants;
				}
			}
			else {
				++symbol;
			}
			
			++i;
		}
		
		System.out.println(vowelcount);
		
		System.out.println(consonants);
		
		System.out.println(symbol);
	}
	
	
}
