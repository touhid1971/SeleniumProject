package collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LearningTreeMap {

	public static void main(String[] args) {
		
		Map<String, Integer> names = new TreeMap<String, Integer>();
		
		names.put("Touhid", 456);
		names.put("Mehdi", 852);
		names.put("Mamun", 456);
		names.put("Kutub", 111);
		names.put("Daisy", 879);
		names.put("Sumaiya", 222);
		
		System.out.println(names);
		System.out.println(".....................");
		System.out.println(names.size());
		System.out.println("......................");
		
		for(Entry<String, Integer> eachNames:names.entrySet()) {
			
			System.out.println(eachNames.getKey()+"........."+eachNames.getValue());
			
			}
		System.out.println("................");
		
		System.out.println(names.containsKey("Touhid"));
		
		for(Entry<String, Integer> eachNames:names.entrySet()) {
			
			System.out.println(eachNames.getKey()+"................"+eachNames.getValue());
		}
		
		System.out.println("****************************************");
		
		names.remove("Touhid");
		
		System.out.println(names.containsValue(555));
		
		names.clear();
		
		System.out.println(names.isEmpty());
		
		

	}

}
