package arraytypes;

import java.util.Scanner;

public class StudentMarks_array1d {

	public static void main(String[] args) {
		System.out.println("Enter the Size of Array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int marks[]=new int[n];
		int sum=0,percent;
		float avg;
		
		System.out.println("Enter the Elements of Array:");
		for(int i=0; i<n; i++) {
			marks[i]=sc.nextInt();
		}
		System.out.println("Students Marks: ");
		for(int i=0; i<n; i++) {
			System.out.print(marks[i]+" ");
		}
		for(int i=0; i<n; i++) {
			sum=sum+marks[i];
		}
		avg=sum/n;
		percent=sum*100/500;
		System.out.println("TotalMarks: "+sum);
		System.out.println("Average: "+avg);
		System.out.println("Percentage: "+percent+"%");
	}

}
