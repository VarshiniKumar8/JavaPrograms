package basic;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello User");
		System.out.println(s1);
		String str="Welcome";
		String s2= " ";
		System.out.println(str);
		String s3= "     String Example     ";
		String s4= "This is the example of split function";
		System.out.println("Length: "+str.length());
		System.out.println("SubString: "+str.substring(3));
		System.out.println("SubString: "+str.substring(0,2));
		System.out.println("CharAt(3): "+str.charAt(3));
		System.out.println("Contains c: "+str.contains("c"));
		System.out.println("Contains x: "+str.contains("x"));
		System.out.println("IsEmpty: "+s2.isEmpty());
		System.out.println("IsBlank: "+s2.isBlank());
		System.out.println("IndexOf e: "+str.indexOf("e"));
		System.out.println("IndexOf e: "+str.indexOf("e",3));
		System.out.println("LastIndexOf e: "+str.lastIndexOf("e"));
		System.out.println("Equals: "+str.equals(s3));
		System.out.println("EqualsIgnoreCase: "+str.equalsIgnoreCase(s3));
		System.out.println("Concatenation: "+str.concat("User"));
		System.out.println(str);
		str=str.concat("User");
		System.out.println(str);
		System.out.println("Replace: "+s1.replace('e','a'));
		System.out.println("UpperCase: "+s3.toUpperCase());
		System.out.println("LpperCase: "+s1.toLowerCase());
		System.out.println("Length: "+s3.length());
		s3=s3.trim();
		System.out.println("Length: "+s3.length());
		String splittedString[]=s4.split(" ");
		System.out.println("Count of Words: "+splittedString.length);
		for(String string:splittedString)
		{
			System.out.println(str);
		}
	}

}
