package codingchallenge;

//VARSHINI K

interface AuthenticationFunction{
	boolean authenticate(String username,String password);
}
public class SourceAuthenticate {
	public boolean validate(String username,String password) {
		AuthenticationFunction authfunc = (u,p)-> u.equals("Alexa") && p.equals("coded123");
		return authfunc.authenticate(username,password);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SourceAuthenticate login = new SourceAuthenticate();
		String username = "Alexa";
		String password = "codded123";
		boolean result = login.validate(username, password);
		System.out.println(result);
	}
}