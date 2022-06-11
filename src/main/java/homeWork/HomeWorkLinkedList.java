package homeWork;

import java.util.LinkedList;
import java.util.List;

public class HomeWorkLinkedList {

	public static void main(String[] args) {
		
		List<String> worker = new LinkedList<String>();
		
		worker.add("Ershad");
		worker.add("Hasina");
		worker.add("Khaleda");
		worker.add("Mushtak");
		worker.add("Modi");
		worker.add("Indira");
		worker.add("Bhutto");
		worker.add("Imran");
		worker.add("Kairala");
		worker.add("Fakharuddin");
		
		//Print worker list
		System.out.println(worker);
		
		System.out.println("*****************************");
		
		//Get count of total worker
		System.out.println(worker.size());
		
		
		System.out.println("-----------------------");
		
		//Add New Worker
		worker.add("Shahbaz");
		
		//Print worker list after adding new worker
		
		System.out.println(worker);
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		//Count total worker after adding new one
		System.out.println(worker.size());
		
		System.out.println("//////////////////////////////////");
		
		//Verify particular worker- return true/false
		System.out.println(worker.contains("Trump"));
		
		System.out.println("#########################");
		
		//Remove particular worker from the list
		
		worker.remove(1);
		
		//Verify after remove particular worker
		System.out.println(worker.contains("Ershad"));
		
		System.out.println("/////////////////////////");
		
		//Remove all item from the list
		worker.clear();
		
		//Verify after remove- returns true/false
		
		System.out.println(worker.isEmpty());
		
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println("**************************");
		
		List<Integer> id = new LinkedList<Integer>();
		
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
		
		//Print list of id's
		System.out.println(id);
		
		System.out.println(".............................");
		
		//Get count of total id
		System.out.println(id.size());
		
		System.out.println("*****************************");
		
		//Add new id
		id.add(111);
		
		System.out.println("..............................");
		
		//Verify particular id
		System.out.println(id.contains(102));
		
		System.out.println("..............................");
		
		//Print after adding
		for(int i=0; i<id.size(); i++) {
			System.out.println(id.get(i));
		}
		
		System.out.println(".............................");
		//Get count after adding 
		System.out.println(id.size());
		
		System.out.println("..............................");
		
		//Remove particular id
		id.remove(3);
		
		//Verify after remove
		System.out.println(id.contains(103));
		
		System.out.println("..............................");
		
		//Clear list of id
		id.clear();
		
		//Verify after clear
		System.out.println(id.isEmpty());
	
	}

}
