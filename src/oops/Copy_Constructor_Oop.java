package oops;

class Complex{
	int real,img;
	public Complex(){
		this.real=0;
		this.img=0;
	}
	public Complex(int r,int i) {
		this.real=r;
		this.img=i;
	}
	public String toString() {
		return "("+ real+ "+" +img +"i)";
	}
	public Complex(Complex o2) {
		this.real=o2.real;
		this.img=o2.img;	
	}
}
public class Copy_Constructor_Oop {

	public static void main(String[] args) {
		Complex o1=new Complex();
		System.out.println("Object 1: "+o1);
		
		Complex o2=new Complex(3,5);
		System.out.println("Object 2: "+o2);
		
		Complex o3=new Complex(o2);
		System.out.println("Object 3: "+o3);
	}

}
