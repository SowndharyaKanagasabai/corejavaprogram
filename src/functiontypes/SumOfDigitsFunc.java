package functiontypes;

class Main{
	public void func(){
		int num=24;
		int d,sum=0;
		while(num!=0) {
			d=num%10;
			sum=sum+d;
			num=num/10;
		}
		System.out.println("Sum of Digits: "+sum);
	}
}
public class SumOfDigitsFunc {
	public static void main(String[] args) {
		Main obj=new Main();
		obj.func();
	}

}
