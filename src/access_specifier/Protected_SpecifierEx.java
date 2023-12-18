package access_specifier;
class Bank{
	protected double balance;
	protected Bank(double initialbalance) {
		this.balance=initialbalance;
	}
	protected double getbalance() {
		return balance;
	}
}
class Deposit extends Bank{
	double amount;
	protected Deposit(double initialbalance,double a) {
		super(initialbalance);
		this.amount=a;
	}
	protected void deposit_amount() {
		if(amount>0) {
			balance=balance+amount;
		}
		System.out.println("Deposit Amount :"+amount);
		System.out.println("After depoist_balance: "+balance);
	}
}
class Withdraw extends Bank{
	double amount;
	protected Withdraw( double initialbalance,double a) {
		super(initialbalance);
		this.amount=a;
	}
	protected void withdraw_amount() {
		if(amount>0 && amount<=balance) {
			balance=balance-amount;
		}
		System.out.println("Withdraw amount: "+amount);
		System.out.println("After Withdraw_balance :"+balance);
	}
}
public class Protected_SpecifierEx {
	public static void main(String[] args) {
		System.out.println("----------Available Balance-----------");
		Bank obj=new Bank(1000);
		System.out.println("Available Balance: "+obj.getbalance());
		
		System.out.println("-------------Deposit Amount-----------");
		Deposit d =new Deposit(obj.getbalance(),500);
		d.deposit_amount();
		System.out.println("---------------Withdraw Amount----------");
		Withdraw w =new Withdraw(1500,500);
		w.withdraw_amount();
		System.out.println("--------------THANK YOU------------------");
	}

}
