package operatortypes;

public class StringIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("Hello");
		String str2=new String("Hello");
		System.out.println("String:"+(str1==str2));
		str1=str1.intern();
		str2=str2.intern();
		System.out.println("String Intern:"+(str1==str2));
	}

}
