package practice;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean game = true;

		int com1 = r.nextInt(9) + 1;		// 정수형 com1 랜덤값 1~9까지 입력받기
		int com2 = r.nextInt(9) + 1;		// 정수형 com2 랜덤값 1~9까지 입력받기
		int com3 = r.nextInt(9) + 1;		// 정수형 com3 랜덤값 1~9까지 입력받기
		while (com1 == com2) {		// com1= com2값이 다를 때까지 반복
			com2 = r.nextInt(9) + 1;	// com2 랜덤값 1~9까지 입력받기
		}
		while (com1 == com3 || com2 == com3) {	// com1 = com3, com2 =com3 이 아닐때까지 반복 
			com3 = r.nextInt(9);		// com3 랜덤값 1~9까지 입력받기
		}
		while (game) {		// game true일 떄까지 반복
			System.out.print("첫째 자리 : ");
			int num1 = sc.nextInt();		// 정수형 num1 값 입력받기
			System.out.print("둘째 자리 : ");
			int num2 = sc.nextInt();		// 정수형 num2 값 입력받기
			System.out.print("셋째 자리 : ");
			int num3 = sc.nextInt();		// 정수형 num3 값 입력받기

			System.out.printf("입력된 숫자 : %d%d%d\n", num1, num2, num3);

			int strike = 0, ball = 0;		// 정수형 strike, ball 선언 및 0으로 초기화

			if (num1 == num2 || num1 == num3 || num2 == num3) {		// num1= num2, num2=num3, num3=num1 이면
				System.out.println("잘못된 입력입니다.");	
			} else {	// 위의 조건이 아니라면,
				if (num1 == com1)	// num1 = com1일 때
					strike++;		// strike 1증가
				if (num2 == com2)	// num2 = com2일 때
					strike++;		// strike 1증가
				if (num3 == com3)	// num3 = com3일 때
					strike++;		// strike 1증가
				if (num1 == com2 || num1 == com3)	// num1=com2이거나 num1=com3이면
					ball++;		// ball 1증가
				if (num2 == com1 || num2 == com3)	// num2=com1이거나 num2=com3이면
					ball++;		// ball 1증가
				if (num3 == com1 || num3 == com2)	// num3=com1이거나 num3=com2이면
					ball++;		// ball 1증가
			}			
			if (strike == 3) {		// strike가 3이라면
				System.out.println("홈런~!");
				game = false;	// game 끝
			} else if ((num1 != com1 && num1 != com2 && num1 != com3) && (num2 != com1 && num2 != com2 && num2 != com3)
					&& (num3 != com1 && num3 != com2 && num3 != com3)) {	// num1,2,3이 각각 com1,2,3이랑 같지않지않다면
				System.out.println("아웃!");
			} else {
				System.out.println("스트라이크 : " + strike);
				System.out.println("볼 : " + ball);
			}
		}
	}
}