package practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력 : ");
		String operator = sc.next();

		switch(operator) {
			case "+":
				int sum = num1 + num2;
				System.out.println("결과값 : " + sum + "입니다.");
				break;
			case "-":
				int minus = num1 - num2;
				System.out.println("결과값 : " + minus + "입니다.");
				break;
			case "*":
				int multi = num1 * num2;
				System.out.println("결과값 : " + multi + "입니다.");
				break;
			case "/":
				float dvi = num1 / num2;
				System.out.printf("결과값 : " + dvi + "입니다.");
				break;
			default:
				System.out.println("잘못된 연산자입니다.");
				break;
					
		}
	}

}
