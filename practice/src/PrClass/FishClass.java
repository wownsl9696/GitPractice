package PrClass;

import java.util.Random;
import java.util.Scanner;

class Fish {
	String name;
}

class Users {
	static Scanner sc = new Scanner(System.in);
	int index[] = new int[2]; // 현재 0으로 세팅
	Fish f[] = new Fish[3]; // 현재는 모두가 null

	// 캐스팅 기능
//	int[] casting() {
//		int count = 3;
//		int x = UserX();
//		int y = UserY();
//		
//		while (x > 4 || x < 0 || y > 4 || y < 0) {
//			System.out.println("잘못된 입력입니다.");
//			x = UserX();
//			y = UserY();
//			System.out.println("X좌표 : " + x + "\nY좌표 : " + y);
//		}
//	}
//
//	// 이동 기능
//	int[] move() {
//		System.out.println("1. 위 / 2. 아래 / 3. 좌 / 4. 우");
//		int num = input();
//
//		if (num == 1) {
//			x--;
//			if (x == -1) {
//				MoveError();
//				x = 0;
//			}
//			xyop(x,y);
//		} else if (num == 2) {
//			x++;
//			if (x == 5) {
//				MoveError();
//				x = 4;
//			}
//			xyop(x,y);
//		} else if (num == 3) {
//			y--;
//			if (y == -1) {
//				MoveError();
//				y = 0;
//			}
//			xyop(x,y);
//		} else if (num == 4) {
//			y++;
//			if (y == 5) {
//				MoveError();
//				y = 4;
//			}
//			xyop(x,y);
//		} else {
//			Error();
//		}
//	}

	// 물고기 담는 기능
	void reciveFish(Fish f) {
		int i = 0;
		while (this.f[i] != null) {
			i++;
		}
		this.f[i] = f;
	}
	
	public static int UserX() {
		System.out.print("X좌표 입력 : ");
		int x = input();
		return x;
	}
	
	public static int UserY() {
		System.out.print("Y좌표 입력 : ");
		int y = input();
		return y;
	}
	
	
	public static int input() {
		int num = sc.nextInt();
		return num;
	}

	public static void MoveError() {
		System.out.println("이 방향으론 더이상 움직일 수 없습니다.");
	}

	public static void Error() {
		System.out.println("잘못된 입력입니다.");
	}
}

class Lake {
	// 낚시꾼이 이동좌표를 받아서 체크
	// or 호수에 물고기 객체 없을때.
	
	public static void nowState(int lake[][]) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(lake[i][j] + " ");
			}
			System.out.println();
		}
	}
}

public class FishClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
