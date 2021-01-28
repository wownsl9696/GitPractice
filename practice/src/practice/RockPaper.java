package practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean game = true;
		
		while (game) {		// game이 true일 때까지 반복
			System.out.println("1. 게임시작");
			System.out.println("2. 종료");

			System.out.print("번호 입력 : ");
			int num = sc.nextInt();		// 정수형 num 입력받기

			switch (num) {			// num값에 의한 조건문 시작
			case 1:		// num = 1일 때,
				System.out.print("1. 가위, 2. 바위, 3.보를 선택해주세요 : ");
				int user = sc.nextInt();		// 정수형 user 입력받기
				int com = r.nextInt(3)+1;		// 정수형 com 1~3까지 입력받기
				System.out.println("사용자 : " + user + ", 컴퓨터 : " + com);

				switch (user) {		// user값에 의한 조건문 시작
				case 1:		// user = 1일 때, => 가위
					if (com == 1) {		// com값이 1이면, => 가위
						System.out.println("무승부");
					} else if (com == 2) {		// com값이 2이면,  => 바위
						System.out.println("Com 승");
					} else		// com 값이 1, 2가 아니라면, => 보
						System.out.println("User 승");
					break;
				case 2:		//  user = 2일 때, => 바위
					if (com == 1) {		/// com값이 1이면,
						System.out.println("User 승");
					} else if (com == 2) {		// com값이 2이면,
						System.out.println("무승부");
					} else		// com 값이 1, 2가 아니라면,
						System.out.println("Com 승");
					break;
				case 3:		// user = 3일 때, => 보
					if (com == 1) {		// com값이 1이면,
						System.out.println("Com 승");
					} else if (com == 2) {		// com값이 2이면,
						System.out.println("User 승");
					} else		// com 값이 1, 2가 아니라면,
						System.out.println("무승부");
					break;
				}
				break;
			case 2:
				game = false;		// game값 false로 초기화
				break;
			}
		}
	}

}
