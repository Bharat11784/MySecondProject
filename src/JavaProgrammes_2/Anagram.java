package JavaProgrammes_2;

import java.util.Arrays;

public class Anagram {
	
	
	public static void main(String[]args) {
		
		String x="LISTEN";
		String y="SILENT";
		
		char a[]=x.toCharArray();
		char b[]=y.toCharArray();
		
	Arrays.sort(a);
	
	Arrays.sort(b);
	
	boolean status=Arrays.equals(a, b);
	
	if(status==true) {
		System.out.println("anagram");
	}
	else {
		System.out.println("not anagram");
	}
	
				
	}

}
