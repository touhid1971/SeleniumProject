package homeWork;

import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.impl.config.NameSet;

public class HomeWorkArrayList {

	public static void main(String[] args) {
		
		List<String> emp = new ArrayList<String>();
		//List<Integer> names = new ArrayList<Integer>();
		
		emp.add("Tushar");
		emp.add("Kutub");
		emp.add("Neepa");
		emp.add("Lipee");
		emp.add("Sazia");
		emp.add("Daisy");
		emp.add("Sumiya");
		emp.add("Sumit");
		emp.add("Harun");
		emp.add("Sayeed");
		
		//Print the Array List
		System.out.println(emp);
		
		//Get Count of the list
		System.out.println(emp.size());
		
		//Add a new employee
		
		emp.add("Touhid");
		
		//Verify after adding new employee
		System.out.println(emp);
		
		//Get count after adding new employee
		System.out.println(emp.size());
		
		//Print all employees using for loop
		for(int i=0; i<emp.size(); i++) {
		
			System.out.println(emp.get(i));
		}
		
		System.out.println("............................");
		
		//Verify particular employee from the list- returns true/false
		System.out.println(emp.contains("Lipee"));
		
		System.out.println("............................");
		//Delete particular employee from the list
		emp.remove(10);
		
		//Verify remove - returns true/false
		System.out.println(emp.contains("Touhid"));
		
		System.out.println("......................");
		
		
		//Verify list after remove particular employee
		for(int i=0; i<emp.size(); i++) {
			System.out.println(emp.get(i));
		}
		
		//Clear the list
		emp.clear();
		
		//verify the list is clear/empty- returns true false
		System.out.println(emp.isEmpty());
		
		System.out.println("*********************");
		System.out.println("*********************");
		
		//# Making a list using employee ID
		
		List<Integer> id = new ArrayList<Integer>();
		
		id.add(101);
		id.add(102);
		id.add(103);
		id.add(104);
		id.add(105);
		id.add(106);
		id.add(107);
		id.add(108);
		id.add(109);
		id.add(110);
		
		//print employee id
		System.out.println(id);
		
		System.out.println(",,,,,,,,,,,,,,");
		
		//Get count of id
		System.out.println(id.size());
		
		System.out.println("...................");
		//adding new id
		id.add(111);
		System.out.println(id.size());
		
		//Verify particular id - returns true/false
		System.out.println(id.contains(106));
		
		System.out.println("***********************");
		
		//Remove particular id
		id.remove(5);
		
		//verify after remove- returns true/false
		System.out.println(id.contains(106));
		
		System.out.println("*********************");
		
		//Clear List
		id.clear();
		
		//verify the list is clear- returns true/false
		System.out.println(id.isEmpty());
		
		
		
		

	}

}
