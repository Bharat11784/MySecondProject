package com.sort;

public class Emp implements Comparable<Emp>{
	
int eid;
String ename;

public Emp(int eid, String ename) {
	this.eid=eid;
	this.ename=ename;
}

@Override
public int compareTo(Emp e) {
	
	
	if(eid==e.eid)
		return 0;
	
	else if(eid>e.eid)
	return 1;
	
	else
		
		return -1;
	
}






}
