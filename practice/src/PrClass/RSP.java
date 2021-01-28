package PrClass;

import java.util.Random;
import java.util.Scanner;

class Win {
	void output() {
		System.out.println("이겼습니다.");
	}
}

class Lose {
	void output() {
		System.out.println("졌습니다.");
	}
}

class Draw {
	void output() {
		System.out.println("비겼습니다.");
	}
}

class User {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
}

class Com {
	Random r = new Random();
	int num = r.nextInt(3) + 1;
}

public class RSP {

	public static void main(String[] args) {
		boolean game = true;
		while (game) {
			System.out.println("게임시작");
			System.out.println("1. 가위 / 2. 바위 / 3. 보를 선택하여 입력하세요.");
			Win w = new Win();
			Lose l = new Lose();
			Draw d = new Draw();

			User user = new User();
			Com com = new Com();
			
			switch (user.num) {
			case 1:
				if (com.num == 1) {
					d.output();
				} else if (com.num == 2) {
					l.output();
				} else {
					w.output();
				}
				break;
			case 2:
				if (com.num == 1) {
					w.output();
				} else if (com.num == 2) {
					d.output();
				} else {
					l.output();
				}
				break;
			case 3:
				if (com.num == 1) {
					l.output();
				} else if (com.num == 2) {
					w.output();
				} else {
					d.output();
				}
				break;
			default:
				System.out.println("1~3의 숫자를 입력해주세요.");
				game = false;
				break;
			}
		}
	}

}
