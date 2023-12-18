package Iterativetypes;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=n; i>=0; i--) {
			//EVEN:
//			if(i%2==0) {
//				System.out.println(i);
//			}
			//ODD:
//			if(i%2!=0) {
//				System.out.println(i);
//			}
//			
			System.out.println(i);
		}
		

	}

}
