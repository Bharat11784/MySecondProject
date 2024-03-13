package JavaProgrammes_2;

import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;
public class RemoveDuplicate {
	public static void main(String[]args) {
	
	String x="SILLYSPIDER";
	
	char y[]=x.toCharArray();
	
	int size=y.length;
	
	Map<Character,Integer>map=new LinkedHashMap<>();
	
	int i=0;
	
	while(i!=size) {
		
		if(map.containsKey(y[i])==false) {
			
			map.put(y[i], 1);
		}
		else {
			
			int oldval=map.get(y[i]);
			int newval=oldval+1;
			map.put(y[i], newval);
		}
		
		++i;
	}
	
	Set<Map.Entry<Character,Integer>>lhashmap=map.entrySet();
	
	String res="";
	
	for(Map.Entry<Character, Integer> data:lhashmap) {
		
		res=res+data.getKey();
	}
	
	System.out.println(res);

}
}