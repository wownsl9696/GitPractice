package practice;

import java.util.Scanner;

public class ForSample {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

//		avg();
//		AtoZ();
//		gugudan();
//		PosNum();
		System.out.print(8%2);
		sc.close();

	}

	public static void avg() {
		int count = 0;
		int sum = 0;

		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");

		int n = sc.nextInt();
		while (n != -1) {
			sum += n;
			count++;
			n = sc.nextInt();
		}
		if (count == 0)
			System.out.print("입력된 수가 없습니다.");
		else {
			System.out.print("정수의 개수는 " + count + "개이며 ");
			System.out.println("평균은 " + (double) sum / count + "입니다.");
		}

	}

	public static void AtoZ() {
		char c = 'a';

		do {
			System.out.print(c);
			c = (char) (c + 1);
		} while (c <= 'z');
	}

	public static void gugudan() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + i * j);
				System.out.print('\t');
			}
			System.out.println();
		}
	}

	public static void PosNum() {
		System.out.println("정수를 5개 입력하세요");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if (n <= 0)
				continue;
			else
				sum += n;
		}
		System.out.println("양수의 합은 " + sum);
	}

}
