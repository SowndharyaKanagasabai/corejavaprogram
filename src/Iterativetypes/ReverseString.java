package Iterativetypes;

public class ReverseString {

	public static void main(String[] args) {
		//REVERSE STRING:
		StringBuilder sb=new StringBuilder("sowndharya");
		System.out.println("String: "+ sb);
		StringBuilder reverse=new StringBuilder();
		for(int i=sb.length()-1; i>=0; i--) {
			char r=sb.charAt(i);
			reverse.append(r);		
		}
		System.out.println("Reverse String: "+reverse);
	}	
}
