package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearningHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> title = new HashMap<String, Integer>();
		
		title.put("Bipul", 8888);
		title.put("Reza", 222);
		title.put("Sayed", 999);
		title.put("Mamun", 1910);
		title.put("Sumit", 444);
		title.put("Harun", 006);
		title.put("Bipul", 888);
		
		System.out.println(title);
		
		System.out.println("**************************************");
		
		title.size();
		
		System.out.println(title.size());
		
		System.out.println("***********************************");
		
		for(Entry<String, Integer> eachTitle:title.entrySet()) {
			
			System.out.println(eachTitle.getKey()+"             "+eachTitle.getValue());
		}
		
		title.remove("Sayed");
		title.containsKey("Sayed");
		
		System.out.println(title.containsKey("Sayed"));
		
		System.out.println("*********************************");
		title.clear();
		
		System.out.println(title.isEmpty());
		
		

	}

}
