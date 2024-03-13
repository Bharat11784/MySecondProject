package com.sort4;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	public static void main(String[]args) {
		
		ArrayList<Emp>al=new ArrayList<Emp>();
		
		al.add(new Emp(113,"bharat"));
		al.add(new Emp(111,"savita"));
		al.add(new Emp(114,"navami"));
		al.add(new Emp(112,"mahanth"));
		
		Collections.sort(al, new Enamecom());
		
		for(Emp b:al) {
			
			System.out.println(b.eid+"  "+b.ename);
		}
	}

}
