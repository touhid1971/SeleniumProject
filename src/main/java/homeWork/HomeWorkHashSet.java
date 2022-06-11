package homeWork;

import java.util.HashSet;
import java.util.Set;

public class HomeWorkHashSet {

	public static void main(String[] args) {
		
		Set<String> students = new HashSet<String>();
		
		students.add("Sakib");
		students.add("Tamim");
		students.add("Mashrafi");
		students.add("Mushfiq");
		students.add("Mahmud");
		students.add("Miraj");
		students.add("Mustafiz");
		students.add("Rubel");
		students.add("Saikat");
		students.add("Liton");
		students.add("Azhar");
		students.add("Bulbul");
		students.add("Akram");
		students.add("Nannu");
		students.add("Sujon");
		
		//Print the set- Random
		System.out.println(students);
		
		for(String eachStudent:students) {
			
			System.out.println(eachStudent);
		}
		
		System.out.println("...................................");
		//Get count of items
		
		System.out.println(students.size());
		
		System.out.println("...................................");
		
		//Add new item
		
		students.add("Pailot");
		
		//Print after adding new item
		for(String eachStudent:students) {
		System.out.println(eachStudent);	
		
		}
		
		System.out.println("...................................");
		
		//Verify a particular item
		System.out.println(students.contains("Mahmud"));
		
		System.out.println("...................................");
		
		//Remove a item
		students.remove("Mushfiq");
		
		System.out.println(students.contains("Mushfiq"));
		
		System.out.println("...................................");
		
		//Clear all items
		
		students.clear();
		
		//Verify clear
		System.out.println(students.isEmpty());
		
		
		System.out.println("...................................");
		System.out.println("...................................");
		System.out.println("...................................");
		
		Set<Integer> num = new HashSet<Integer>();
		
		//Add items
		num.add(1010);
		num.add(1011);
		num.add(1012);
		num.add(1013);
		num.add(1014);
		num.add(1015);
		num.add(1016);
		num.add(1017);
		num.add(1018);
		num.add(1019);
		num.add(1020);
		num.add(1021);
		num.add(1022);
		num.add(1023);
		num.add(1024);
		
		//Print all items using foreach loop
		for(Integer eachNum:num) {
			
			System.out.println(eachNum);
			
		}
		
		//Clear all items in the Set
		
		num.clear();
		
		//Verify clear
		System.out.println(num.isEmpty());
		
		

	}

}
