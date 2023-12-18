package oops;
//Method overriding
class Online_Payment{
	int balance;
	Online_Payment(int b){
		this.balance=b;
	}
	void Payment() {
		System.out.println("you can transfer your money anywhere via online.");
	}
}
class Googlepay extends Online_Payment{
	Googlepay(int b) {
		super(b);
		System.out.println("Googlepay Balance: "+super.balance);
	}
	void Payment() {
		System.out.println("Transfer Money directly from Your Bank account.");
	}
}
class Paytm extends Online_Payment{
	Paytm(int b) {
		super(b);
		System.out.println("Paytm Balance: "+super.balance);
	}
	void payment() {
		System.out.println("Transfer Money via using QR code. ");
	}
}
class Bank extends Online_Payment{
	Bank(int b) {
		super(b);
		System.out.println("Bank Balance: "+super.balance);
	}
	void payment() {
		System.out.println("Transfer Money via using Card");
	}
}
public class Method_OverridingEx {
	public static void main(String[] args) {
		Bank obj=new Bank (5000);
		obj.payment();
		Paytm obj1=new Paytm(4000);
		obj.payment();
		Googlepay obj2=new Googlepay(2500);
		obj2.Payment();
	}
}