package operatortypes;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CALCULATOR USING SWITCH CASE:
		char ch;
		int number1, number2, result;
		System.out.println("Enter your choice:");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		System.out.println("Enter the number_1");
		number1=sc.nextInt();
		System.out.println("Enter the number_2:");
		number2=sc.nextInt();
		switch(ch) {
		case '+':
			result=number1+number2;
			System.out.println("Addition:"+result);
			break;
		case '-':
			result=number1-number2;
			System.out.println("Substraction:"+result);
			break;
		case '*':
			result=number1*number2;
			System.out.println("Multiplication:"+result);
			break;
		case '/':
			result=number1/number2;
			System.out.println("Divide:"+result);
			break;
		default:
			System.out.println("Invalid operator");
		}

	}

}
