package loop;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int[] num = new int[3];
		num[0] = 5;
		num[1] = 10;
		num[2] = 15;
		
		for (int eachnum:num) {
			
			System.out.println(eachnum);
		}
		String[] emp = new String[3];
		emp[0] = "Touhid";
		emp[1] = "Mamun";
		emp[2] = "Bipul";
		
		for (String eachname:emp) {
			
			System.out.println(eachname);
		}
			
	}

}
