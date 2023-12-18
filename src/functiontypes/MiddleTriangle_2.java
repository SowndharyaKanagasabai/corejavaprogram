package functiontypes;

import java.util.Scanner;
class Middleone{
	int i,j,s;
	public void display (int n) {
	for(i=1; i<=n; i++) {
		for(s=1; s<=n-i; s++) {
			System.out.print(" ");
		}
		for(j=1; j<=i; j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	}
}
public class MiddleTriangle_2 {
	public static void main(String[] args) {
		//System.out.println("Enter the 3 numbers: ");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		Middleone Tri=new Middleone();
		Tri.display(n1);
		Tri.display(n2);
		Tri.display(n3);
		

	}

}
