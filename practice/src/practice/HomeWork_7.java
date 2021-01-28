package practice;

import java.util.Scanner;

public class HomeWork_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean zero = true;		// zero 변수 선언 및 true로 초기화

		while (zero) {		// zero 변수의 값이 true일 때까지 반복
			System.out.print("정수를 입력하세요 : ");
			int num = sc.nextInt();		// 정수형 num 입력받기

			if (num > 0) {		// num이 0 초과일 때,
				int i = 0;		// 정수형 i 선언 및 0으로 초기화
				System.out.print(num + "의 약수 : ");
				for (i = 1; i <= num; i++) {	// 1부터 1씩 증가하며 num 이하일 때까지 반복
					if ((num % i) == 0) {		// num을 i로 나눴을때의 나머지가 0이랑 같을 때,
						System.out.print(i);	// i 출력
						System.out.print(" ");	// 빈 칸 출력
					}
				}
				System.out.println("입니다");
				break;
			} else if( num <0) {		// num이 0 미만일 때,
				System.out.println("음수는 잘못된 입력입니다.");
				break;
			}
			else {	// num = 0일 때,
				System.out.println("종료합니다.");
				zero = false; 	// zero 값 false로 초기화
				break;
			}
		}
	}

}
