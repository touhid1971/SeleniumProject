package homeWork;

public class HomeWork_Array {

	public static void main(String[] args) {
		
		/*
		 Home Work
		 
		 1.	Write and explain the Syntax of Array.
		 
		*	To declare an array, define the variable type with square brackets:
		*	Place the values in a comma-separated list, inside curly braces:
		
		DateType[] array = {value separated by comma};
		
		Integer: 
		int[] id = {10, 20, 30, 40};
		
		String: 
		String[] names = {"Harun", "Kutub", "Tushar"};
		
		Character: 
		char[] ch = {'a', 'b'};
		
		
		
		2.	Create an array by using below marks of Mathematic of 10th Grade Students of a school.
			Marks: 60,65,70,78, 80,86,90,92,95
				a)	Print a particular index value from the array
				b)	Print gets count of array
				c)	Print all value from the array */
	/*
		int[] mark = {60,65,70,78, 80,86,90,92,95};
		
		mark[0] = 60;
		mark[1] = 65;
		mark[2] = 70;
		mark[3] = 78;
		mark[4] = 80;
		mark[5] = 86;
		mark[6] = 90;
		mark[7] = 92;
		mark[8] = 95;*/
		
		 
		/*Answer 2(a)
		System.out.println(mark[3]);
		
		/Answer 2(b)
		System.out.println(mark.length);
		
		/Answer 2(c)
		for(int i=0; i<mark.length; i=i+1) {
			 System.out.println(mark[i]);*/
			 
		/*3.	Create a list of employee name those who are working in Walmart Inc.
				Employee Name: David, Smith, Erika, Priscila, Regina, Tammy, Paul, Garcia
					a)	Print Priscila from the list
					b)	 Print Gets count of list
					c)	Print all names from the list*/
			 
		/*String[] emp = {"David", "Smith", "Erika", "Priscila", "Regina", "Tammy", "Paul", "Garcia"};
			 
			 emp[0] = "David";
			 emp[1] = "Smith";
			 emp[2] = "Erika";
			 emp[3] = "Priscila";
			 emp[4] = "Regina";
			 emp[5] = "Tammy";
			 emp[6] = "Paul";
			 emp[7] = "Garcia";*/
		
			 //Answer 3(a)
			 
		//System.out.println(emp[3]);
			 
			 //Answer 3(b)
		//System.out.println(emp.length);
			 
			 //Answer 3(c)
			
			 /*
			 for(int i=0; i<emp.length; i=i+1) {
				 
				 System.out.println(emp[i]);
				 
			/*4.Explain limitations/problems of the Array and when the Array shows ArrayIndexOutOfBoundExceptions,
			 and print the exception in the console?*/
				 
			//Limitations of Array:
				//1. We can not add value more than its boundary
			
			 //ArrayIndexOutOfBoundExceptions shows when number of index is more than limit

	}

}
