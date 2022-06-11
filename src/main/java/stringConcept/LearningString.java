package stringConcept;

public class LearningString {
	public static void main(String[] args) {
		
		String text = "Learning is good";
		String text1 = "Learning is good";
		String text2 = "There is no limit of learning";
		
		System.out.println(text);
		System.out.println(text1);
		System.out.println(text2);
		
		//Identify memory locations
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
		System.out.println(System.identityHashCode(text2));
		
		//Equals() (compare two strings) - return true false
		
		System.out.println(text.equals(text1));
		System.out.println(text.equals(text2));
		System.out.println(text1.equals(text2));
		
		//Length() returns count of string with white space
		System.out.println(text.length());
		System.out.println(text1.length());
		System.out.println(text2.length());
		
		
		//Concat() - add more than two string
		System.out.println(text.concat(text1));
		System.out.println(text.concat(text2));
		System.out.println(text1.concat(text2));
		System.out.println(text.concat(text1).concat(text2));
		
		//Concat() - two different data type
		String num = "15";
		String num1 = "20";
		
		int x = 50;
		int y = 60;
		
		System.out.println(num+x); //String + Integer
		System.out.println(num.concat(num1)); //String +String
		
		//Concat() - tow or more integer
		System.out.println(x+y); //Integer+Integer
		
		//Trim()-  Erase/Remove begining ending white space of a string
		
		String text3 = "     He is a boy      ";
		
		System.out.println(text3); //print text3 as it is
		System.out.println(text3.length()); //count length of trim3 as it is
		System.out.println(text3.trim()); //print text3 after trim
		System.out.println(text3.trim().length()); //count length of trim3 after trim
		
		//Upper Case and Lower Case
		
		String statement = "He is a Good Boy. He reads in Class Eight. His Hobby is playing Cricket";
		
		System.out.println(statement.toLowerCase());//lower case
		System.out.println(statement.toUpperCase());//UPPER CASE
		
		//Contains - verify partial string- returns true false
		System.out.println(statement.contains("Good"));
		System.out.println(statement.contains("Girl"));
		System.out.println(statement.contains("Class"));
		System.out.println(statement.contains("eight"));
		
		
		
	}

}
