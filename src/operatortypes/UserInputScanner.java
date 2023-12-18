package operatortypes;

import java.util.Scanner;

public class UserInputScanner {

	public static void main(String[] args) {
//		//integer
//		System.out.println("Enter the number:");
//		Scanner sc=new Scanner(System.in);
//		int a,b,c;
//		a=sc.nextInt();
//		b=sc.nextInt();
//		c=(a*a)+(2*a*b)+(b*b);
//		System.out.println("Answer"+c);	
//		
//		//float
//		System.out.println("Enter the float number:");
//		float percentage=sc.nextFloat();
//		System.out.println("Percentage:"+percentage);
//		
//		//String 
//		System.out.println("Enter your name:");
//		String full_name=sc.next();
//		System.out.println("Full Name:"+full_name);
//		
//		//charAt():single letter
//		System.out.println("Enter your Full_name:");
//		char name=sc.next().charAt(0);
//		System.out.println("single letter of ur name:"+name);	
		
		//Multiline:
//		System.out.println("Enter the input:");
//		Scanner sc=new Scanner(System.in);
//		String str_1=sc.nextLine();
//		System.out.println("Enter the another input:");
//		String str_2=sc.nextLine();
//		System.out.println(str_1+" "+str_2);	
		
		//Ternary operator:
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=12;
		b=11;
		c=7;
		int max=(a>b && a>c)?a:(b>c)?b:c;
		System.out.println("Max of 3 numbers:"+max);
		
	}

}
