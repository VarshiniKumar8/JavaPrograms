package exceptionhandling;

public class TryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 25/0;
			System.out.println(a);
		}
		catch(Exception e){
			//System.out.println(e);
			//System.err.println(e);
			e.printStackTrace();
		}
		System.out.println("Rest of code");
	}

}
