package exception_handling;

class Methods extends Exception{
	public Methods(String msg) {
		super(msg);
	}
}
public class Marks_ExceptionEx {
	public String Marks_Eligible(int marks) throws Methods{
		if(marks < 0) {
			throw new Methods("Marks cannot be less than 0");
		}
		else if(marks >100) {
			throw new Methods("Marks cannot be Greater than 100");
		}
		else {
			return "Mark is Eligible for Evaluation";
		}
	
	}	
	public static void main(String[] args) {
		Marks_ExceptionEx ex=new Marks_ExceptionEx();
		try {
			System.out.println("Mark: "+(ex.Marks_Eligible(-45)));
		}
		catch(Methods e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Welcome");
		}
	}

}
