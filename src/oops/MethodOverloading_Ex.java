package oops;

class Mathoperation{
	//METHOD OVERLOADING
		public static int multiply(int a, int b) {
			return a*b;
		}
		public static double multiply(float x, double y) {
			return x*y;
		}
		public static float multiply(int i, float j) {
			return i*j;
		}
		public static int multiply(int r) {
			return r*r;
		}
	}
		
public class MethodOverloading_Ex {

	public static void main(String[] args) {
		System.out.println("Multiplication: "+Mathoperation.multiply(5,3));
		System.out.println("Multiplication: "+Mathoperation.multiply(12.5f,6.00));
		System.out.println("Multiplication: "+Mathoperation.multiply(7,3.5f));
		System.out.println("Multiplication: "+Mathoperation.multiply(5));
		
	}

}
