package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetLearning {

	public static void main(String[] args) {
		
		Set<Integer> obj = new HashSet<Integer>();
		
		obj.add(120);
		obj.add(130);
		obj.add(910);
		obj.add(357);
		obj.add(1045);
		
		System.out.println(obj);
		
		System.out.println(obj.size());
	}

}
