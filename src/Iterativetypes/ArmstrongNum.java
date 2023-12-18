package Iterativetypes;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner in=new Scanner(System.in);
		//SUM OF DIGITS
		int n=in.nextInt();
		int d;
		int temp=n,sum=0;
		while(n!=0) {
			d=n%10;
			n=n/10;
			sum=sum+d*d*d;
			//sum += Math.pow(d, 3);
		}
		System.out.println("Sum of digits:"+sum);
		
		//ARMSTRONG NUMBER
		if(temp == sum) {
			System.out.println(temp+"  is an Armstrong Number.");
		}
		else {
			System.out.println(temp+" is not an Armstrong Number.");
		}
	}

}
