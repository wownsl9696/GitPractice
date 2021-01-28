package practice;

import java.util.Scanner;

public class Method {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("연산자 입력 : ");
		String ex = sc.next();

		if (ex.equals("+")) {
			int num1 = input();
			int num2 = input2();
			output(add(num1, num2));
		} else if (ex.equals("-")) {
			output(minus());
		} else if (ex.equals("*")) {
			int num1 = input();
			int num2 = input2();
			mul(num1, num2);
		} else if (ex.equals("/")) {
			div();
		} else {
			fail();
		}
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int minus() {
		int a = input();
		int b = input2();
		return a - b;
	}

	public static void mul(int a, int b) {
		output(a * b);
	}

	public static void div() {
		int a = input();
		int b = input2();
		divResult((double) a / (double) b);
	}

	public static void divResult(double result) {
		System.out.printf("결과 값 : %.1f", result);
	}

	public static void fail() {
		System.out.print("잘못된 연산자입니다.");
	}

	public static void output(int result) {
		System.out.printf("결과 값 : %d", result);
	}

	public static int input() {
		System.out.print("숫자1 입력: ");
		int a = sc.nextInt();
		return a;
	}

	public static int input2() {
		System.out.print("숫자2 입력: ");
		int a = sc.nextInt();
		return a;
	}
}
