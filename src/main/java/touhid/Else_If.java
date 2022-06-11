package touhid;

public class Else_If {

	public static void main(String[] args) {
		
		int x= 30;
		int y = 25;
		
		if (x<=y) {
			
			System.out.println("x is less than or equal to y");
		}else if(x<y)  {
			System.out.println("x is less than y");
			
		}else if(x>y) {
			System.out.println("x is grater than y");
		}else {
			System.out.println("x is not equal to than y");
		}

	}

}
