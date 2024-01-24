package codingchallenge;

/* created by VARSHINI K */

public class AgeChecking {
	public void CheckAge(int age) throws MyException{
		if(age<15) {
			throw new MyException("Not valid");
		}
		else
		{
			System.out.println("valid");
		}
	}
	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		AgeChecking age = new AgeChecking();
		age.CheckAge(22);
	}

}
