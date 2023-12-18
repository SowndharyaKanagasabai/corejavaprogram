package oops;
//INTERFACE EXAMPLE
class Instagram_login{
	String name;
	int age;
	Instagram_login(String n,int a){
		this.name=n;
		this.age=a;
	}
	public void show(){
		System.out.println("Username: "+name);
		System.out.println("Age: "+age);
	}
}
interface login{
	void email();
	void Password();
}
class User extends Instagram_login implements login{
    String Account_type;
	User(String n, int a,String type) {
		super(n, a);
		this.Account_type=type;
	}
	static void after_login() {
		System.out.println("put your fav pic on your profile.");
	}
	void account() {
		System.out.println("Set your Account: "+Account_type);
	}
	@Override
	public void email() {
		System.out.println("your email is required for login");
	}
	@Override
	public void Password() {
		System.out.println("Password is must required for insta login");
	}	
}
public class Interface_Oop {
	public static void main(String[] args) {
		User obj=new User("sowndharya",21,"Private");
		obj.show();
		obj.email();
		obj.Password();
		obj.account();
		User.after_login();
	}
}
