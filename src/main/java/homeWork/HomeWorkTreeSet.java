package homeWork;

import java.util.Set;
import java.util.TreeSet;

public class HomeWorkTreeSet {

	public static void main(String[] args) {
		
		Set<String> stdn = new TreeSet<String>();
		
		//Add Students in the set
		
		stdn.add("Trump");
		stdn.add("Bayden");
		stdn.add("Kisinger");
		stdn.add("Obama");
		stdn.add("Bush");
		stdn.add("Clinton");
		stdn.add("Nixon");
		stdn.add("Lincoln");
		stdn.add("Hilary");
		stdn.add("Kamala");
		stdn.add("Washington");
		stdn.add("Putin");
		stdn.add("Zelnaski");
		stdn.add("Jonson");
		stdn.add("Mackron");
		
		
		//Print the set (output ascending order)
		
		System.out.println(stdn);
		
		//Get count - total item
		System.out.println(stdn.size());
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		
		//Adding new student
		stdn.add("Salman");
		
		//Count after adding
		System.out.println(stdn.size());
		
		//Print after adding new student
		
		for(String eachStdn:stdn) {
			
			System.out.println(eachStdn);
		}
		
		System.out.println("..............................");
		
		//Remove particular student
		stdn.remove("Bush");
		
		//Verify remove
		System.out.println(stdn.contains("Bush"));
		
		System.out.println("..............................");
		
		//Verify particular item in the set
		
		System.out.println(stdn.contains("Obama"));
		
		System.out.println("..............................");
		
		//Clear Set
		stdn.clear();
		
		//Verify Set is clear
		System.out.println(stdn.isEmpty());
		
		System.out.println("..............................");
		System.out.println("..............................");
		System.out.println("..............................");
		
		
		Set<Integer> stdid = new TreeSet<Integer>();
		
		//Add items
		
		stdid.add(1111);
		stdid.add(2222);
		stdid.add(3333);
		stdid.add(4444);
		stdid.add(5555);
		stdid.add(6666);
		stdid.add(7777);
		stdid.add(8888);
		stdid.add(9999);
		stdid.add(1110);
		stdid.add(1122);
		stdid.add(2233);
		stdid.add(3344);
		stdid.add(4455);
		stdid.add(5566);
		
		
		//Print the set- Ascending order
		
		for(Integer eachId:stdid) {
			
			System.out.println(eachId);
		}
		
		System.out.println("..............................");
		
		//Get count
		System.out.println(stdid.size());
		
		System.out.println("..............................");
		
		//Remove particular item from the set
		
		stdid.remove(9999);
		
		//Verify after remove
		System.out.println(stdid.contains(9999));
		
		System.out.println("..............................");
		
		//Clear Set
		
		stdid.clear();
		
		//Verify after clear
		System.out.println(stdid.isEmpty());
	}

}
