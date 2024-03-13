package com.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
	
	public static void main(String[]args) {
		
		ArrayList<Emp>al=new ArrayList<Emp>();
		
		al.add(new Emp(114,"navami"));
		
		al.add(new Emp(113,"savita"));
		
		al.add(new Emp(112,"mahanth"));
		
		al.add(new Emp(111,"bharat"));
		
		Collections.sort(al);
		
		for(Emp gh:al) {
			System.out.println(gh.eid);
		}
	}

}
