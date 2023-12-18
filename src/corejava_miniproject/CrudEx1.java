package corejava_miniproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


class Employee{
	private int empno;
	private String ename;
	private int salary;
	Employee(int empno,String ename, int salary){
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	//GETTER
	public int getEmpno(){
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public int getSalary() {
		return salary;
	}
	//SETTER
	public void setEmpno(int empno) {
		this.empno=empno;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public String toString() {
		return empno+" "+ename+" "+salary;
	}
}

public class CrudEx1 {
	public static void main(String[] args) {
		List<Employee> c=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			ch=sc.nextInt();
		
			
			switch(ch){
			
			
			case 1:
				System.out.println("Enter the Employee number: ");
				int empno=sc.nextInt();
				System.out.println("Enter the Employee name: ");
				String ename=sc1.nextLine(); 
				System.out.println("Enter the Employee Salary: ");
				int salary=sc.nextInt();
				
				c.add(new Employee(empno,ename,salary));
			break;
			
			
			case 2:
				System.out.println("----------------------------------------");
				Iterator<Employee>i=c.iterator();
				while(i.hasNext()) {
					Employee e=i.next();
					System.out.println(e);
				}
				System.out.println("----------------------------------------");
			break;
			
			
			case 3:
				boolean found=false;
				System.out.println("Enter the Employee Number: ");
			    empno=sc.nextInt();
			    i=c.iterator();
			    while(i.hasNext()) {
			    	Employee e=i.next();
			    	if(e.getEmpno()==empno) {
			    		System.out.println(e);
			    		found=true;
			    	}
			    }
			    if(!found) {
		    		System.out.println("Record is not Found");
		    	}
			    System.out.println("-----------------------------------------");
			break;
			
			case 4:
				found=false;
				System.out.println("Enter Employee number to Delete: ");
				empno=sc.nextInt();
				i=c.iterator();
				while(i.hasNext()) {
					Employee e=i.next();
					if(e.getEmpno()==empno) {
						i.remove();
						found=true;
					}
				}
				if(!found) {
					System.out.println("Record is not Found");
				}
				else {
					System.out.println("Record Deleted Sucessfully");
				}
			break;
			
			case 5:
				found=false;
				System.out.println("Enter the Empno to Update: ");
				empno=sc.nextInt();
				ListIterator<Employee> li =c.listIterator();
				while(li.hasNext()) {
					Employee e=li.next();
					if(e.getEmpno()==empno) {
						System.out.println("Enter new ename: ");
						 ename=sc1.nextLine();
						 
						System.out.println("Enter new Salary: ");
						 salary=sc.nextInt();
						 
						 li.set(new Employee(empno,ename,salary));
						 found=true;	 
					}
				}
				if(!found) {
					System.out.println("Record not Found");
				}
				else {
					System.out.println("Record is Updated Sucessfully");
				}
			break;
			}
		}
		while(ch!=0);
		
		
	}

}
