package operatortypes;

public class ArithmaticEx {

	public static void main(String[] args) {
		//post_increment
		int a=10;
		int x=a++;
		System.out.println("post increment:"+x);
		//pre_increment
		int b=10;
		int y=++b;
		System.out.println("Pre Increment:"+y);
		//post decrement
		int c=10;
		int z=c--;
		System.out.println("Post decrement:"+z);
		//pre decrement
		int d=10;
		int zz=--d;
		System.out.println("Pre decrement:"+zz);
		//nagation
		int i=100;
		System.out.println("nagation:"+(~i));
	}

}
