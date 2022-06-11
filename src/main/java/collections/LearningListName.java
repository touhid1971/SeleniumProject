package collections;

import java.util.ArrayList;
import java.util.List;

public class LearningListName {

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<String>();
		
		name.add("Tushar");
		name.add("Touhid");
		name.add("Mamun");
		name.add("Harun");
		name.add("Kutub");
		name.add("Daisy");
		name.add("Sumit");
		name.add("Sumiya");
		name.add("Sayed");
		name.add("Reza");
		
		//print the list
		System.out.println(name);
		
		//get the count of the list
		System.out.println(name.size());
		
		System.out.println();
		//Verify existing "Bijoy" in the list
		System.out.println(name.contains("Bijoy"));
	
		
		//add a new name
		System.out.println();
		name.add("Tushar");
		
		
		//verify after adding new name
		for(String eachName:name) {
			
			System.out.println(eachName);
		}
		
		//remove a item from the list
		System.out.println();
		name.remove("Sumit");
		
		System.out.println();
		
		//verify the list after remove
		System.out.println(name);
		
		System.out.println();
		
		
		
		//clear the list
		
		name.clear();
		
		//verify after clear the list
		System.out.println(name.isEmpty());
		
		
		
		
		
		
		
		
		
		

	}

}
