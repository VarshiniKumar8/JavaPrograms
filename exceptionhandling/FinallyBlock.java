package exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Case 1: where exception doesn't occurs");
		try {
			int a = 25/5;
			System.out.println("Div: "+a);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Case 1: finally block always executes");
		}
		System.out.println("Case 1: Rest of code...");
		System.out.println("----------------------------------------------");
		
		System.out.println("\nCase 2: where exception occurs and handled");
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Case 2: finally block always executes");
		}
		System.out.println("Case 2: Rest of code...");
		System.out.println("----------------------------------------------");
		
		System.out.println("Case 3: where exception occurs but handled");
		try {
			int a = 25/0;
			System.out.println("Div: "+a);
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Case 3: finally block always executes");
		}
		System.out.println("Case 3: Rest of code...");
		System.out.println("----------------------------------------------");
	}

}
