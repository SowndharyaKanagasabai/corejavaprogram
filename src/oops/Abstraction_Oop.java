package oops;

abstract class Mobile{
	Mobile(){
		System.out.println("Constructor from Abstract class");
	}
	void call() {
		System.out.println("We can make a phone call.");
	}
	static void message() {
		System.out.println("we can making messages.");
	}
	
	abstract void camera();//Method Signature=>method without body
	abstract void ram();
}
class Samsung extends Mobile{

	@Override
	void camera() {
		System.out.println("47 piexels");
	}

	@Override
	void ram() {
		System.out.println("4gb Ram");
		
	}
	
}
class Vivo extends Mobile{

	@Override
	void camera() {
		System.out.println("32 piexels");
		
	}

	@Override
	void ram() {
		System.out.println("6gb Ram");
		
	}
	
}
public class Abstraction_Oop {

	public static void main(String[] args) {
		System.out.println("------SAMSUNG-------");
		Mobile s=new Samsung();
		Mobile.message();
		Mobile mob;//Reference=>we can create an object but u can provide your reference;
		mob=s;
		s.call();
		s.camera();
		s.ram();
		System.out.println("---------VIVO-------");
		Mobile v=new Vivo();
		Mobile.message();
		v.call();
		v.camera();
		v.ram();
		
	}

}
