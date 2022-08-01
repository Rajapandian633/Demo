package if_else_concepts_15_may_2022;

public class If_else_ifelse_elseif_concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if statement
		
		int x = 20;
		int y = 18;
		if (x > y) {
		  System.out.println("x is greater than y");
		}
		
		//else statement
		
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		
		// Outputs "Good evening."
		
		//else if statement
		
		int date = 22;
		if (date < 10) {
		  System.out.println("Good morning.");
		} else if (time < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		// Outputs "Good evening.
		
		//if else statement
		
		int time1 = 20;
		if (time1 < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}

	}

}
