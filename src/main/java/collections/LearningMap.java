package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JacksonInject.Value;

public class LearningMap {

	public static void main(String[] args) {
		
		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		
		mp.put("Touhid", 123);
		mp.put("Harun", 456);
		mp.put("Mamun", 555);
		mp.put("Tushar", 444);
		mp.put("Daisy", 666);
		mp.put("Mamun", 222);
		
		for(Entry<String, Integer> eachMp:mp.entrySet()) {
			
			System.out.println(eachMp.getKey()+"      "+eachMp.getValue());
		}
		
		System.out.println("......................");
		
		
		mp.size();
		System.out.println(mp.size());
		
		System.out.println("...............................");
		
		System.out.println(mp.containsKey("Daisy"));
		
		System.out.println("........................");
		
		System.out.println(mp.containsValue(222));
		
		System.out.println("..........................");
		
		mp.remove("Touhid");
		mp.containsKey("Touhid");
		System.out.println(mp.containsKey("Touhid"));
		
		System.out.println("...................");
		
		System.out.println(mp.size());
		
		System.out.println("................");
		
		for(Entry<String, Integer> eachMem:mp.entrySet()) {
			
			System.out.println(eachMem.getKey()+"       "+eachMem.getValue());
		}
		
		System.out.println(".....................");
		mp.clear();
		
		System.out.println(mp.isEmpty());
		
	}

}
