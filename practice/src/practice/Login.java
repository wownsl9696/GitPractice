package practice;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean state = true;

		String id = null, pw = null, checkid = null, checkpw = null;
		// id, pw, checkid, checkpw 문자열 선언 및 null 값으로 초기화.

		while (state) {		// state = true일 때까지 반복.
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");

			System.out.println("번호 입력 : ");
			int num = sc.nextInt();		// 정수형 int 입력받기

			switch (num) {		// num값에 의한 조건문 시작
			case 1:		// num = 1일 떄,
				System.out.println("id를 입력하세요 : ");
				id = sc.next();		// id 입력받기
				System.out.println("pw를 입력하세요 : ");
				pw = sc.next();		// pw 입력받기

				System.out.println(id + "님 회원가입이 됐습니다.");
				break;
			case 2:		// num = 2일 때,
				if (id != null && pw != null) {		// id, pw가 값이 있다면,
					System.out.println("id를 입력하세요 : ");
					checkid = sc.next();	// checkid 입력받기
					System.out.println("pw를 입력하세요 : ");
					checkpw = sc.next();	// checkpw 입력받기

					System.out.println(id + pw + checkid + checkpw);

					if (id.equals(checkid) && pw.equals(checkpw)) {	// id = checkid, pw = checkpw 이라면,
						System.out.println(id + "님 환영합니다!");		// id 로그인 출력
					} else		// id != checkid, pw != checkpw 이라면,
						System.out.println("ID와 PW가 틀립니다.");
				} else {	// id, pw의 값이 없다면,
					System.out.println("회원가입이 되지않았습니다.");

					System.out.println("id를 입력하세요 : ");
					checkid = sc.next();	// checkid 입력받기
					System.out.println("pw를 입력하세요 : ");
					checkpw = sc.next();	// checkpw 입력받기

					id = checkid;		// id에 checkid 값 저장.
					pw = checkpw;		// pw에 checkpw 값 저장.
					System.out.println(id + "님 회원가입이 됐습니다.");
				}
				break;
			case 3:		// num = 3일 때,
				System.out.println("안녕히 가세요.");
				state = false; 	// state 값 false 초기화
				break;
			}
		}
	}

}
