package arraytypes;
import java.util.Scanner;
public class Sorting_Array2D{

	public static void main(String[] args) {
		System.out.println("Enter the size of Array: ");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		int i,j,r,c,k,l;
		int temp=0;
		System.out.println("Enter the element of Array:");
		for(i=0; i<arr.length; i++) {
			for (j=0; j<arr.length; j++) {
				arr[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("Before Sorting: ");
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		for(r=0; r<arr.length; r++) {
			for(c=0;c<arr.length;c++) {
				for(k=0;k<arr.length;k++) {
					for(l=0;l<arr.length;l++) {
						//SWAPING
						if(arr[r][c]<arr[k][l]) {
							temp=arr[r][c];
							arr[r][c]=arr[k][l];
							arr[k][l]=temp;
						}
					}
				}
			}
		}
        System.out.println("After Sorting 2D Array: ");
        for(i=0; i<arr.length; i++) {
        	for(j=0; j<arr.length; j++) {
        		System.out.print(arr[i][j]+"  ");
        	}
        	System.out.println();
        }	     
		
	}
}