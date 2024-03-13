package com.sort3;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
	
	public static void main(String[]args) {
		
		ArrayList<Emp>al=new ArrayList<Emp>();
		
		al.add(new Emp(113,"bharat"));
		
		al.add(new Emp(111,"savita"));
		
		al.add(new Emp(112,"mahanth"));
		
		al.add(new Emp(114,"navami"));
		
		Collections.sort(al);
		
		for(Emp h:al) {
			System.out.println(h.eid);
		}
	}

}
