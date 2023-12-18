package functiontypes;

public class TypeCasting {

	public static void main(String[] args) {
		//CONVERTING STRING TO INTEGER:
		String string="100";
		int result=Integer.parseInt(string);
		System.out.println("Result of Integer: "+result);
		
		//Typecasting Types:Widening casting, narrowing casting
		byte a=10;
		short b=20;
		int c=b;
		float d=c;
		System.out.println("------------WIDENING CASTING----------");
		System.out.println("short:"+b);
		System.out.println("int: "+c);
		System.out.println("float: "+d);
		//Narrow casting:
		int num1=30;
		float F=(float)num1;
		byte B=(byte)num1;
		short S=(short)B;
		System.out.println("-------------NARROW CASTING-----------");
		System.out.println("FLOAT:"+F);
		System.out.println("BYTE:"+B);
		System.out.println("SHORT:"+S);
		
		
		
		
		
		

	}

}
