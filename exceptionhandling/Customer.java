package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {

	public static void main(String[] args) throws IOException, NumberFormatException {
		// TODO Auto-generated method stub
		int id;
		String name;
		double prin,rate,year,total;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ID: ");
		id=Integer.parseInt(reader.readLine());
		System.out.println("Enter Name: ");
		name = reader.readLine();
		System.out.println("Enter Principle Amount: ");
		prin=Double.parseDouble(reader.readLine());
		System.out.println("Enter Year: ");
		year= Double.parseDouble(reader.readLine());
		System.out.println("Enter Rate: ");
		rate= Double.parseDouble(reader.readLine());
		total=(prin*year*rate)/100;
		System.out.println("Simple Interest: "+total);
	}

}
