package exceptionhandling;

public class ThrowKeyword {
	public static void checkAge(int age) {
		if(age>=18)
			System.out.println("Eligible for voting");
		else
			throw new ArithmeticException("Age is not valid");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(15);
		System.out.println("Rest of code...");
	}

}
