package Iterativetypes;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//REVERSE NUM
		int number=123, reverse=0;
		int temp=number;
		while(number!=0){
			int rem=number%10;
			reverse=reverse*10+rem;
			number=number/10;
		}
		System.out.println("Reverse number:"+reverse);
		
		//PALINDROME NUM
		if(temp==reverse) {
			System.out.println("it is Palindrome.");
		}
		else {
			System.out.println("It is not Palindrome.");
		}
	}
}
