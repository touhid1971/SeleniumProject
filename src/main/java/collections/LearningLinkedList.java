package collections;

import java.util.LinkedList;
import java.util.List;

public class LearningLinkedList {

	public static void main(String[] args) {
		
		List<String> emp = new LinkedList<String>();
		
		
		//Add list in LinkedList
		emp.add("Shihab");
		emp.add("Farid");
		emp.add("Jalil");
		emp.add("Nasir");
		emp.add("Mintu");
		emp.add("Liton");
		emp.add("Khukon");
		emp.add("Mahbub");
		emp.add("Polash");
		emp.add("Mukul");
		
		//Verify the LinkList
		System.out.println(emp);
		
		System.out.println();
		
		//Verify Particular item in the list
		System.out.println(emp.get(4));
		
		System.out.println();
		
		//Get count of the list
		System.out.println(emp.size());
		
		System.out.println();
		
		//Print the list
		for(String eachEmp:emp) {
			
			System.out.println(eachEmp);
		}

		System.out.println();
		
		
		//Verify a particular item
		System.out.println(emp.contains("Nasir"));
		
		//Add a new item
		emp.add("Luthfur");
		
		//Print the list after adding new item using forloop
		for (int i=0; i<emp.size(); i=i+1) {
			
			System.out.println(emp.get(i));
		}
		
		
	}

}
