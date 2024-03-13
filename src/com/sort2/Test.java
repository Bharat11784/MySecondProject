package com.sort2;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	public static void main(String[]args) {
		
		ArrayList<Emp> al=new ArrayList<Emp>();
		
		al.add(new Emp(112,"mahanth"));
		al.add(new Emp(114,"bharat"));
		al.add(new Emp(111,"navami"));
		al.add(new Emp(113,"savita"));
		
		Collections.sort(al, new EnameComp());
		
		for(Emp kl:al) {
			System.out.println(kl.eid+"  "+kl.ename);
		}
	}

}
