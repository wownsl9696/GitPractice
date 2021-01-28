package practice;

import java.util.Scanner;

public class QFive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean last = true;
		
		while (last) {
			System.out.println("1. 원하는 구구단 출력");
			System.out.println("2. 전체 구구단 출력");
			System.out.println("3. 종료");

			System.out.print("번호 입력 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.print("원하는 구구단 숫자 입력 : ");
				int gugu = sc.nextInt();

				if (gugu >= 2 && gugu <= 9)
					for (int i = 1; i < 10; i++) {
						System.out.println(gugu + " * " + i + " = " + (gugu * i));
					}
				else {
					System.out.println("2~9 이외의 숫자는 잘못된 입력입니다.");
				}
				break;

			case 2:
				for (int i = 1; i < 10; i++) {
					for (int j = 2; j < 6; j++) {
						System.out.print(j + " * " + i + " = " + (i * j) + '\t');
					}
					System.out.println();
				}
				System.out.println();
				for (int k = 1; k < 10; k++) {
					for (int l = 6; l < 10; l++) {
						System.out.print(l + " * " + k + " = " + (k * l) + '\t');
					}
					System.out.println();
				}

				break;

			case 3:			
				System.out.println("종료합니다.");
				last = false;
				break;
			default:
				System.out.println("1~3 이외의 숫자는 잘못된 입력입니다.");
			}

		}

	}

}
