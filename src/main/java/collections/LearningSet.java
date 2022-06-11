package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearningSet {

	public static void main(String[] args) {
		
		//Set<Integer> obj = new TreeSet<Integer>(); - Rendom order output
		//Set<Integer> obj = new HashSet<Integer>(); - Ascending order output
		Set<Integer> obj = new LinkedHashSet<Integer>();  // -Inserting order output
		
		
		//1) Add Items
		
		obj.add(123);
		obj.add(124);
		obj.add(456);
		obj.add(789);
		obj.add(963);
		obj.add(123456);
		obj.add(258);
		obj.add(123);
		
		
		System.out.println(obj);
		
		System.out.println();
		
		//2) Get Count of set - Total number
		System.out.println(obj.size());
		
		System.out.println();
		
		//3) Print all items of set using foreach loop
		for(Integer eachObj:obj) {
			
			System.out.println(eachObj);
			
		}
		
		System.out.println();
		//4) Check particular item in the set - True/False
		
		System.out.println(obj.contains(159));
		
		//5) Remove particular item from the set
		
		obj.remove(123);
		
		System.out.println();
		
		
		//verify the particular item removed
		System.out.println(obj);
		
		System.out.println();
		
		//6) Remove all items from the set
		
		obj.clear();
		//verify after remove all items
		System.out.println(obj.isEmpty());
		
		
		

	}

}
