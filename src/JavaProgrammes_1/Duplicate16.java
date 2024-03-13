package JavaProgrammes_1;

public class Duplicate16 {
	
	public static void main(String[]args) {
		
		String ar[]= {"java","bharat","savita","java"};
		
		boolean flag=false;
		for(int i=0;i<ar.length;i++) {
			
			for(int j=i+1;j<ar.length;j++) {
				
				if(ar[i]==ar[j]) {
					System.out.println(ar[i]);
					
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("not found");
		}
		
	}

}
