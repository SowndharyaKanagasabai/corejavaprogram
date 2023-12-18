package arraytypes;

import java.util.Scanner;

public class TwoDim_Array {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		Scanner in=new Scanner(System.in);
		int r,c;
		r=in.nextInt();
		c=in.nextInt();
		int[][]arr=new int[r][c];
		System.out.println("Give a numbers for array element:");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j]=in.nextInt();
			}	
		}
		
		System.out.println("Two Dimensional Array: ");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	
	}

}
