package arraytypes;

import java.util.Arrays;
import java.util.Scanner;
class Namelist{
	public void display(int n) {
		Scanner sc=new Scanner(System.in);
		String name[]=new String[n];
		System.out.println("Enter the name of students: ");
		for(int i=0;i<name.length;i++) {
			name[i]=sc.next();
		}
		System.out.println("Studentname: ");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println("Name of Array: "+Arrays.toString(name));
	}
}
public class SingleDim_Array {
	public static void main(String[] args) {
		System.out.println("Enter a size of Array: ");
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		Namelist stud=new Namelist();
		stud.display(n);
		
	}

}
