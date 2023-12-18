package Iterativetypes;

public class PalindromeEx {

	public static void main(String[] args) {
		//PALINDROME
		String in="madam";
		System.out.println("String: "+in);
		StringBuffer a=new StringBuffer(in);
		String op=a.reverse().toString();
		if(in.equals(op)) {
			System.out.println("String is PALINDROME.");
		}
		else {
			System.out.println("String is not PALINDROME.");
		}		
 }

}

