package operatortypes;

import java.util.Scanner;

public class PositiveorNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CHECK THE NUMBER IS POSITIVE OR NEGATIVE
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if (num==0) {
			System.out.println("ZERO");
		}
		else if(num>0) {
			System.out.println(num+" is POSITIVE");
		}
			
		else {
			System.out.println(num+" is NEGATIVE");
		}

	}

}
