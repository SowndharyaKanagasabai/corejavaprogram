package operatortypes;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PRINT THE GREATEST OF 3 NUMBER:
	System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
	    int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
	    c=sc.nextInt();
	    if(a>b && a>c) {
	    	System.out.println(a+"= a is Greater");
	    }
	    else if(b>a && b>c) {
			System.out.println(b+"= b is Greater");
		}
	    else {
			System.out.println(c+"= cis Greater");
	    }	
	}

}
