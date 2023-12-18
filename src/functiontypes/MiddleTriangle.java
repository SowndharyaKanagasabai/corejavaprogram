package functiontypes;

import java.util.Scanner;
public class MiddleTriangle {

	public static void main(String[] args) {
		//MIDDLE TRIANGLE PATTERN
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rowcount=1;
		for(int i=n; i>0; i--) {
			for(int s=1; s<i; s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=rowcount; j++) {
				System.out.print(rowcount+" ");
			}
			System.out.println();
			rowcount++;
		}
		System.out.println("             ");
		System.out.println("MIDDLE STAR PATTERN");
		//MIDDLE TRIANGLE ANOTHER TYPE
		for(int i=1; i<=n; i++) {
			for(int s=1; s<=n-i; s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
