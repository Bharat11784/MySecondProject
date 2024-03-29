package JavaProgrammes_2;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
public class FillDataMap {
	
	public static void main(String[]args) {
		
		String x="bangalore";
		
		char y[]=x.toCharArray();
		
		int size=y.length;
		
		Map<Character,Integer>map=new HashMap<>();
		
		int i=0;
		
		while(i!=size) {
			
			if(map.containsKey(y[i])==false) {
				
				map.put(y[i], 1);
			}
			else
			{
				int oldval=map.get(y[i]);
				int newval=oldval+1;
				map.put(y[i], newval);
			}
			++i;
		}
		
		Set<Map.Entry<Character,Integer>>hashmap=map.entrySet();
		
		for(Map.Entry<Character,Integer> data:hashmap) {
			
			System.out.println(data.getKey());
			System.out.println(data.getValue());
		}
	}

}
