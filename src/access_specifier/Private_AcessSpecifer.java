package access_specifier;

class Private_EX{
	private int a=30;
	String str="Sowndharya";
	int number;
	void showA() {
		System.out.println("A: "+a);
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}

public class Private_AcessSpecifer {

	public static void main(String[] args) {
		Private_EX demo=new Private_EX();
		demo.showA();
		System.out.println("Name: "+demo.str);
		demo.setNumber(29);
		System.out.println("integer: "+demo.getNumber());

	}

}
