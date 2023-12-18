package exception_handling;

import java.util.Scanner;
class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}
public class Custom_ExceptionEx {
	public String checkName (String firstName, String lastName) throws MyException {
		if(firstName.isEmpty()) {
			throw new MyException("First Name  is cannot be Empty");
		}
		else if(lastName.isEmpty()) {
			throw new MyException("Last Name is Cannot be Empty");
		}
		else {
			return firstName+" "+lastName;
		}
	}
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("First Name: ");
		String firstname=sc.nextLine();
		System.out.println("Last Name: ");
		String lastname=sc.nextLine();
		Custom_ExceptionEx c = new Custom_ExceptionEx();
		try {
			String FullName=c.checkName(firstname, lastname);
			System.out.println("Full Name: "+FullName);
		} 
		catch (MyException e) {
			System.out.println(e.getMessage());
		} 
	}
}
