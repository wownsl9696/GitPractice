package PrInheritance;

import java.util.Scanner;

class Control {

	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

	int min(int a, int b) {
		return a - b;
	}

	double min(double a, double b) {
		return a - b;
	}

	int mul(int a, int b) {
		return a * b;
	}

	double mul(double a, double b) {
		return a * b;
	}

	int div(int a, int b) {
		return a / b;
	}

	double div(double a, double b) {
		return a / b;
	}

	int input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		return sc.nextInt();
	}

	double inputd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		return sc.nextDouble();
	}

	void output(int result) {
		System.out.println("결과 값 : " + result);
	}

	void output(double result) {
		System.out.println("결과 값 : " + result);
	}

	void error() {
		System.out.println("잘못된 입력입니다.");
	}
}

public class T_Seven {

	public static void main(String[] args) {
		Control c = new Control();

		Scanner sc = new Scanner(System.in);

		boolean game = true;

		while (game) {
			System.out.println("1. 정수연산  2. 실수연산  3. 종료");
			int num = c.input();

			switch (num) {
			case 1:
				System.out.println("1. 더하기  2. 빼기  3. 곱하기  4. 나누기");
				int oper = c.input();
				
				switch (oper) {
				case 1:
					c.output(c.add(c.input(), c.input()));
					break;
				case 2:
					c.output(c.min(c.input(), c.input()));
					break;
				case 3:
					c.output(c.mul(c.input(), c.input()));
					break;
				case 4:
					c.output(c.div(c.input(), c.input()));
					break;
				default:
					c.error();
					break;
				}
				break;
			case 2:
				System.out.println("1. 더하기  2. 빼기  3. 곱하기  4. 나누기");
				System.out.print("번호 입력 : ");
				int opers = c.input();

				switch (opers) {
				case 1:
					c.output(c.add(c.inputd(), c.inputd()));
					break;
				case 2:
					c.output(c.min(c.inputd(), c.inputd()));
					break;
				case 3:
					c.output(c.mul(c.inputd(), c.inputd()));
					break;
				case 4:
					c.output(c.div(c.inputd(), c.inputd()));
					break;
				default:
					c.error();
					break;
				}
				break;
			case 3:
				System.out.println("종료합니다.");
				game = false;
				break;
			default:
				c.error();
				break;
			}
		}
		sc.close();
	}

}
