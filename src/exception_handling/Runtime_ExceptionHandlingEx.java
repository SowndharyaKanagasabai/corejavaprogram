package exception_handling;
import java.util.*;
public class Runtime_ExceptionHandlingEx {
	public static void main(String[] args){
		try {
			//code
			int a[]= {2,3,4};
			System.out.println("Array Element:"+a[1]);
			
			int b=20/2;
			System.out.println("Element b:"+b);	
			
			String c="abc";
		    //int s=Integer.parseInt(c);
			System.out.println("value of c: "+c);
			
			int d[]={3,4,5,6};
			System.out.println("The length of the array is: "+ d.length);
			
			String text="java";
			System.out.println(text.charAt(10));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e1) {
			System.out.println(e1);
		}
		catch(NumberFormatException e2) {
			System.out.println(e2);
		}
		catch(IndexOutOfBoundsException e3){
			System.out.println("IndexOutOfBoundsException :"+ e3.getMessage());//getmessage()
		}
		catch(NullPointerException e4) {
			System.out.println(e4);
		}
		finally {
			System.out.println("Finally Block from Runtime Exception");
		}		
	}

}
