package collections;

import java.util.ArrayList;
import java.util.List;

public class LearningList {

	public static void main(String[] args) {
		
		//Homework: Create a list of 10 employees(names & id) by using ArrayList and LinkedList and implements all of the methods

		//add list of id for 10 employees
		
		List<Integer> id = new ArrayList<Integer>();
		
		id.add(10);
		id.add(11);
		id.add(12);
		id.add(13);
		id.add(14);
		id.add(15);
		id.add(16);
		id.add(17);
		id.add(18);
		id.add(19);
		
		
		System.out.println(id);
		
		//get the count of the list
		System.out.println(id.size());
		
		//adding new item
		id.add(20);
		
		System.out.println(id);
		
		//get count after adding new item
		System.out.println(id.size());
		
		
	/*	for (Integer eachId : id) {
			
			System.out.println(eachId);
		}*/
		
		for(int i=0; i<id.size(); i=i+1) {
			
			System.out.println(id.get(i));
			
		//	Delete particular item from the list
			id.remove(3);
			
			//System.out.println(id);
	
			System.out.println();
			//verify list after remove the particular item
			for(i=0; i<id.size(); i=i+1) {
				
				System.out.println(id.get(i));
				
			
				
			}
			
			System.out.println();
	//verifying particular item in the list
			
			System.out.println(id.contains(5));
			}
			
		System.out.println();
		
		//clear the list
		id.clear();
		
		System.out.println();
		//verify the list clear
		System.out.println(id.isEmpty());
			
		}
		
		
		
		
	}
	


