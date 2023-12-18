package oops;

//Constructor Example
class RectangleShape{
	int length,breadth;
	RectangleShape(){
		System.out.println("default Constructor: ");
		length=12;
		breadth=6;
	}
	int area() {
		return length*breadth;
	}
	
}
public class Constructors_Ex {

	public static void main(String[] args) {
		RectangleShape obj=new RectangleShape();
		System.out.println("Area of Rectangle: "+obj.area());

	}

}
