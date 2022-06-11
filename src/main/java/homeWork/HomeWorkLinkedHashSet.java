package homeWork;

import java.util.LinkedHashSet;
import java.util.Set;

public class HomeWorkLinkedHashSet {
	public static void main(String[] args) {
		
		
		Set<String> persons = new LinkedHashSet<String>();
		
		persons.add("Salman");
		persons.add("Shahruk");
		persons.add("Aamir");
		persons.add("Saief");
		persons.add("Amitab");
		persons.add("Mithun");
		persons.add("Shakti");
		persons.add("Saief");
		persons.add("Jashim");
		persons.add("Ilias");
		persons.add("Razzak");
		persons.add("Wasim");
		persons.add("Faruk");
		persons.add("Salman");
		persons.add("Riyaz");
		persons.add("Bulbul");
		persons.add("Manna");
		
		//Print all items- Output Ascending Order
		
		for(String eachPerson:persons) {
			
			System.out.println(eachPerson);
		}
		
		System.out.println(".........................");
		//Get Count
		System.out.println(persons.size());
		
		//Pick one person from the set
		
		System.out.println(".........................");
		
		System.out.println(persons.contains("Riyaz"));
		
		System.out.println(".........................");
		
		//Remove one person from the set
		
		persons.remove("Amitab");
		
		//Verify remove
		System.out.println(persons.contains("Amitab"));
		
		//Clear the All items from the Set
		
		persons.clear();
		
		//Verify clear
		System.out.println(persons.isEmpty());
		
				
	}

}
