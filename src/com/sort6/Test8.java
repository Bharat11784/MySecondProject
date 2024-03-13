package com.sort6;

import java.util.Comparator;
import java.util.TreeSet;

public class Test8 {
	public static void main(String[]args) {
		
		TreeSet<Product> t=new TreeSet<Product>(new Mycom6());
		
		t.add(new Product(114,"navami"));
		t.add(new Product(112,"savita"));
		t.add(new Product(111,"bharat"));
		t.add(new Product(113,"mahanth"));
		
		for(Product s:t) {
			
			System.out.println(s.id+"  "+s.name);
		}
		
	}	

}

class Mycom6 implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		
		return p1.name.compareTo(p2.name);
		
	}
	
}
