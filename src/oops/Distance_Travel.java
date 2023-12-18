package oops;
import java.util.Scanner;
class Main{
	int u,a,k,h,t;
	public Main(int t){
		u=36;
		a=5;
		k=1000;
		h=3600;
		this.t=t;
	}
	public int calcu() {
		int total=(u*k/h)*t+((a*t*t)/2);
		return total;
	}
}
public class Distance_Travel {
	public static void main(String[] args) {
		Main t1=new Main(10);
		System.out.println(t1.calcu());
		Main t2=new Main(8);
		System.out.println(t2.calcu());	
	}

}
