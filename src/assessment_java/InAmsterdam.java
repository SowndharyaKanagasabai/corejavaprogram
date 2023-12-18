package assessment_java;
import java.util.Scanner;
public class InAmsterdam {
	   public int countAm(String s) {
	       int count = 0;
         String str = s.toLowerCase();
         String a[]=str.split(" ");
         for(int  i=0; i<a.length; i++) {
        	 if(a[i].equals("am")) {
        		 count=count+1;
        	 }
	   	}
	   		return count;

	   }

	   public static void main(String[] args) {
		   
		   Scanner sc=new Scanner(System.in);
       
	       InAmsterdam obj = new InAmsterdam();
	       
	       String inputString = sc.nextLine();

	       int result = obj.countAm(inputString);

	       System.out.println(result);

	   }

	}

