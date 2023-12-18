package oops;

class Employee{
	int sal=0;
	public void companyName() {
		String companyName="TCS";
		System.out.println("Company Name: "+companyName);
		System.out.println("EMPLOYEE SALARY TYPES:");
	}
}
class Permanent_Employee extends Employee{
	// HRA=5000,DA=500,TA=2000,Salary;
	int sal,HRA,DA,TA;
	public Permanent_Employee(int sal ) {
      HRA=5000;
      DA=500;
      TA=2000;
      this.sal=sal;
	}
	public int p_salary() {
		return sal+HRA+DA+TA;
	}
	
}
class Temporary_Employee extends Employee{
	public Temporary_Employee(int fsal) {
		this.sal=fsal;
	}
	public void t_salary() {
		System.out.println("Temporary Employee Salary: "+sal);
	}
}
class Contract_Employee extends Employee{
	int fixrate,hr;
	public Contract_Employee(int hr) {
		fixrate=500;
		this.hr=hr;
	}
	public int c_salary() {
		return fixrate*hr;
	}
	
}
public class Hierachical_InheritanceEX2 {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.companyName();
		
		Permanent_Employee obj1=new Permanent_Employee(30000);
		System.out.println("Permanent Employee Salary: "+obj1.p_salary());
		
		Temporary_Employee obj2= new Temporary_Employee (25000);
		obj2.t_salary();
		
		Contract_Employee obj3=new Contract_Employee(12);
		System.out.println("Contract Employee Salary: "+obj3.c_salary());

	}

}
