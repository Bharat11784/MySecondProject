package JavaProgrammes_1;

import java.util.Scanner;

public class Largestno7 {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		
		int a=sc.nextInt();
		
		System.out.println("enter number");
		
		int b=sc.nextInt();
		
		System.out.println("enter number");
		
		int c=sc.nextInt();
		
		int largest=a>b?a:b;
		
		int largest1=c>largest?c:largest;
		
		System.out.println(largest1);
	}
}
