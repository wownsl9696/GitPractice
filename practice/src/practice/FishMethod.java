package practice;

import java.util.Random;
import java.util.Scanner;

public class FishMethod {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		compare(FishMake());
	}

	public static int[][] FishMake() {
		Random r = new Random();
		int lake[][] = new int[5][5];
		int row = 0, col = 0;

		for (int i = 0; i < 3; i++) {
			row = r.nextInt(5);
			col = r.nextInt(5);
			if (lake[row][col] == 0) {
				lake[row][col] = 7;
			} else {
				i--;
			}
		}
		nowState(lake);
		return lake;
	}

	public static void nowState(int lake[][]) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(lake[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void compare(int lake[][]) {
		int count = 3;
		int x = UserX();
		int y = UserY();
		
		while (x > 4 || x < 0 || y > 4 || y < 0) {
			System.out.println("잘못된 입력입니다.");
			x = UserX();
			y = UserY();
			System.out.println("X좌표 : " + x + "\nY좌표 : " + y);
		}
		
		if (lake[x][y] == 7) {
			System.out.println("물고기를 잡았습니다!");
			lake[x][y] = 0;
			count--;
		}
		
		nowState(lake);
		UDLR(lake, x, y);
		
		
	}
	
	public static void xyop(int x, int y) {
		System.out.println("X좌표 : " + x + "\nY좌표 : " + y);
	}
	public static void UDLR(int lake[][],int x, int y) {
		int count = 3;
		while (count != 0) {
			System.out.println("1. 위 / 2. 아래 / 3. 좌 / 4. 우");
			int num = input();

			if (num == 1) {
				x--;
				if (x == -1) {
					MoveError();
					x = 0;
				}
				xyop(x,y);
			} else if (num == 2) {
				x++;
				if (x == 5) {
					MoveError();
					x = 4;
				}
				xyop(x,y);
			} else if (num == 3) {
				y--;
				if (y == -1) {
					MoveError();
					y = 0;
				}
				xyop(x,y);
			} else if (num == 4) {
				y++;
				if (y == 5) {
					MoveError();
					y = 4;
				}
				xyop(x,y);
			} else {
				Error();
				continue;
			}

			if (lake[x][y] == 7) {
				System.out.println("물고기를 잡았습니다!");
				lake[x][y] = 0;
				count--;
			}

			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(lake[i][j] + " ");
				}
				System.out.println();
			}
		}
		System.out.println("물고기를 모두 잡았습니다.");
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
