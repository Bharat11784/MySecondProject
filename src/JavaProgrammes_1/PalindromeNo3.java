package JavaProgrammes_1;

import java.util.Scanner;

public class PalindromeNo3 {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num=sc.nextInt();
		
		int rev=0;
		
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("reverse no" +rev);
		
		if(num==rev) {
			
			System.out.println("palindrome no");
		}
		else {
			System.out.println("not palindrome no");
		}
		
	}

}
