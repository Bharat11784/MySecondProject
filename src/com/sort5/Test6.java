package com.sort5;

import java.util.Comparator;
import java.util.TreeSet;

public class Test6 {
	
	public static void main(String[]args) {
		
		TreeSet<Product> t=new TreeSet<Product>(new Mycom4());
		
		t.add(new Product(111,"mahanth"));
		t.add(new Product(114,"savita"));
		t.add(new Product(112,"navami"));
		t.add(new Product(113,"bharat"));
		
		for(Product d:t) {
			System.out.println(d.id+"  "+d.name);
		}
	}

}

class Mycom4 implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		
		return p1.name.compareTo(p2.name);
	}
	
	
}
