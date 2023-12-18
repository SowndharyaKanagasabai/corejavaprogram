package functiontypes;

class Methods{
	int a=12, b=17;
	//NO RETURN TYPE WITHOUT PARAMETER: IN ANOTHER CLASS USING SCANNER 
	public void add() {		
		System.out.println("Addition: "+(a+b));	
	}
	//RETURN TYPE WITHOUT ARGUMENTS/PARAMETER:
	  int sub() {
		return a-b;
	}
	//NO RETURN WITH PARAMETER/ARGUEMENTS:
	  void mul(int x, int y) {
		  System.out.println("Multiplication: "+(x*y));
	  }
	 //RETURN TYPE WITH ARGUMENTS/PARAMETER
	  int div(int i, int j) {
		  return i/j;
	  }
	  //STATIC WITH ARGUMENTS/PARAMETER
	  static float division(int A, int B) {
		  return A/B;
	  } 
}

public class TypesOfFunction {
	//NO RETURN TYPE WITHOUT PARAMETER:IN SAME CLASS FUNCTION
	int a=10, b=5;
	void Addition() {
		System.out.println("Addition: "+(a+b));
	}
	//STATIC METHOD IN_CLASS:
	static String display() {
		return "HELLO EVERYONE TO JAVA";
	}

	public static void main(String[] args) {
		//IN_CLASS OBJECT
		TypesOfFunction o=new TypesOfFunction();
		o.Addition();
		
		//SAME CLASS STATIC 
		System.out.println("Static in Same class: "+display());
		
		//ANOTHER CLASS OBJECT
		Methods obj=new Methods();
		obj.add();
		System.out.println("Substraction: "+obj.sub());
		obj.mul(2,4);
		System.out.println("Division: "+obj.div(10,2));
		
		//STATIC IN ANOTHER CLASS
		System.out.println("Static method in another class: "+Methods.division(35, 2));

	}

}
