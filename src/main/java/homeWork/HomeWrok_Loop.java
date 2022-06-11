package homeWork;

public class HomeWrok_Loop {

	public static void main(String[] args) {
		/*Loops: Homework
		1.	What is loop/Iterator and why we use it?
		 			
		 	Loop or Iterator executes a block of code as long as a specified condition is reached.
		 	We use loop because it saves time, reduce code, reduce error and code is more readable.	
		 	
		 	A loop allows us to execute a statement or group of statements multiple times. 
		 	For example we want to print "My name is Touhid" five times. In Java we have to write this code five times as follows
		 		system.out.println("My name is Touhid");
		 		system.out.println("My name is Touhid");
		 		system.out.println("My name is Touhid");
		 		system.out.println("My name is Touhid");
		 		system.out.println("My name is Touhid");
		 		
		 	But using loop we write the code one time and print the statement as much as required.
		 	
		 	
		2.	Write the Syntax of all 4 loops.
		
			Syntex of Loops:
		
			i) For Loop	(if the number of iteration is fixed): 
			
						for (initialization; condition; increment){
							statement(s);
						}
				
				ex:
						for (int i=1; i<=10; i++){
								system.out.println(i);
			}
			
			ii) While Loop (if the number of iteration is not fixed):
				
					initialization
					while (condition){
						statement(s);
						increment;
					
					}
					
					int i = 1;
					while (i<=10){
						statement(i);
						
						i= i+1;
					}
					
			iii) Do while loop (iteration no is not fixed and execute at least once):
			
					initialization;
					do{
						statement(s);
						increment;
					
					} while(condition);
					
					
					ex:
					int i=1;
					do{
						statement(i);
						i= i+1;
					
					} while(i<=10);
					
			iv) for each loop: (in order to traversing/navigating the elements of array and collection)
				
					For (DataType eachCollections : Collection){
						Statement (eachCollections);
					
					ex:
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

							
				
		 	
		 	A loop allows us to execute a statement or group of statements multiple times. 
		 	For example we want to print "My name is Touhid" five times. In Java we have to write this code five times as follows
		 		system.out.println("My name is Touhid");
		 		system.out.println("My name is Touhid");
		 		system.out.println("My name is Touhid");
		 		system.out.println("My name is Touhid");
		 		system.out.println("My name is Touhid");
		 		
		 	But using loop we write the code one time and print the statement as much as required.
		 	
		 	
		 3.	Print “I am learning Selenium using Java language” 15 time by using for loop
		 	
		 	for (int i=1; i<=15; i=i+1) {
			
			System.out.println("I am learning Selenium using Java Language");
		}
		
		4.	Write an array of 10 employees names of a company and print all the names by using for loop.
		
			String[] names = new String[10];
		
		names[0]= "Touhid";
		names[1]= "Mamun";
		names[2]= "Tushar";
		names[3]= "Bipul";
		names[4]= "Harun";
		names[5]= "Kutub";
		names[6]= "Daisy";
		names[7]= "Sumaiya";
		names[8]= "Odud";
		names[9]= "Rumel";
		
		for(int i=0; i<names.length; i=i+1) {
			
			System.out.println(names[i]);
		}
	
		
		5.	Print all the even numbers up to 40 starting from 2 by using while loop
		
			int i = 2;
			while(i<=40) {
			System.out.println(i);
			
			i=i+2;
			
		}
		 	
		 	
		 6.	Print all the odd numbers up to 35 starting from 3 by using do while loop.
		 
		 	 int i=3;
		 	 do {
			 System.out.println(i);
			 i=i+2;
		 	}while(i<35);
		 	
		 7.	Create an array of 10 students of Selenium QA class and print all students 
		 	name on the console by using for each loop (use Array creation way-1).
		 	
		 	public class For_Each_Loop {

			public static void main(String[] args) {
			String[] student = {"Rumel", "Mamun", "Harun", "Reza", "Shipan", "Kutub", "Bipul", "Sayed", "Sumit", "Daisy"};
		
			for(String eachStudent:student) {
			System.out.println(eachStudent);
		}
		 
		8.	Write an array of 20 employees ID numbers of an organization and print all the id of employees on the console by using 
			for each loop (use Array creation way-2).
			
			package loop;

			public class ForEachLoopArray {

			public static void main(String[] args) {
		
			int[] id = new int[20];
		
			id[0] = 111;
			id[1] = 112;
			id[2] = 113;
			id[3] = 114;
			id[4] = 115;
			id[5] = 116;
			id[6] = 117;
			id[7] = 118;
			id[8] = 119;
			id[9] = 120;
			id[10] = 121;
			id[11] = 122;
			id[13] = 123;
			id[14] = 124;
			id[15] = 125;
			id[16] = 126;
			id[17] = 127;
			id[18] = 128;
			id[19] = 129;
			id[20] = 130;
		
			for(int eachId:id) {
			
			System.out.println(eachId);
		}
		
		9.	When we use for loop and for each loop?
		
			We use for loop if the number of iteration is fixed. On the other hand we use for each loop with arrays and collections
		
		10.	What is the main difference of “While loop” and “Do While loop”?
		
			a) While loop checks the condition first and then executes the statement(s), whereas do while loop will execute the statement(s)
			at least once, then the condition is checked. 
			
			b) While loop is entry controlled loop whereas do while is exit controlled loop.
			
			c) While loop statement(s) is executed zero times if the condition is false whereas do while statement is executed at least once.
			
		11. Why “For each loop” difference from other loops?
		
			1) It is easy to use
			2) No need to write initialization, condition and increment
	}

}



	}

		 			
		 			
		 			
		 			*/
	}
	
	

}
