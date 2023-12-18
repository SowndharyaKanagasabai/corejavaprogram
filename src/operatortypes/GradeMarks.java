package operatortypes;

import java.util.Scanner;

public class GradeMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Grade Marks
		System.out.println("Enter your Marks:");
		Scanner sc=new Scanner(System.in);
		int java,c,python,avg;
		 java=sc.nextInt();
		 c=sc.nextInt();
		 python=sc.nextInt();
		 avg=(java+c+python)/3;
		 System.out.println("Average:"+avg);
		 if(avg>=90 && avg<=100) {
			 System.out.println("Grade A"+" Excellent.");
		 }
		 else if(avg>=80 && avg<=89) {
			 System.out.println("Grade B"+" Good."); 
		 }
		 else if(avg>=70 && avg<=79) {
			 System.out.println("Grade c"+" Improve.");
		 }
		 else {
			 System.out.println("Grade D"+" Try Again.");
			 
		 }
		 
	}

}
