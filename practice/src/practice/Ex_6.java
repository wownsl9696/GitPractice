package practice;

import java.util.Random;
import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		int lake[][] = new int[5][5];
		int row = 0, col = 0;
//		boolean game = true;

		Scanner s = new Scanner(System.in);
		Random r = new Random();

//		int fish = 0;

		for (int i = 0; i < 3; i++) {
			row = r.nextInt(5);
			col = r.nextInt(5);
			if (lake[row][col] == 0) {
				lake[row][col] = 7;
			} else {
				i--;
			}
		}

		int i, j = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(lake[i][j] + " ");
			}
			System.out.println();
		}

		System.out.print("X좌표 입력 : ");
		int x = s.nextInt();
		System.out.print("Y좌표 입력 : ");
		int y = s.nextInt();

		int count = 3;
		while (x > 4 || x < 0 || y > 4 || y < 0) {
			System.out.println("잘못된 입력입니다.");
			System.out.print("X좌표 입력 : ");
			x = s.nextInt();
			System.out.print("Y좌표 입력 : ");
			y = s.nextInt();
			System.out.println("X좌표 : " + x + "\nY좌표 : " + y);
		}

		if (lake[x][y] == 7) {
			System.out.println("물고기를 잡았습니다!");
			lake[x][y] = 0;
			count--;
		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(lake[i][j] + " ");
			}
			System.out.println();
		}

		while (count != 0) {
			System.out.println("1. 위 / 2. 아래 / 3. 좌 / 4. 우");
			int num = s.nextInt();

			if (num == 1) {
				x--;
				if (x == -1) {
					System.out.println("0보다 작을 수는 없습니다.");
					x = 0;
				}
				System.out.println("X좌표 : " + x + "\nY좌표 : " + y);
			} else if (num == 2) {
				x++;
				if (x == 5) {
					System.out.println("4보다 클 수는 없습니다.");
					x = 4;
				}
				System.out.println("X좌표 : " + x + "\nY좌표 : " + y);
			} else if (num == 3) {
				y--;
				if (y == -1) {
					System.out.println("0보다 작을 수는 없습니다.");
					y = 0;
				}
				System.out.println("X좌표 : " + x + "\nY좌표 : " + y);
			} else if (num == 4) {
				y++;
				if (y == 5) {
					System.out.println("4보다 클 수는 없습니다.");
					y = 4;
				}
				System.out.println("X좌표 : " + x + "\nY좌표 : " + y);
			} else {
				System.out.println("잘못된 입력입니다. 1~4의 숫자를 입력해주세요.");
				continue;
			}

			if (lake[x][y] == 7) {
				System.out.println("물고기를 잡았습니다!");
				lake[x][y] = 0;
				count--;
			}

			for (i = 0; i < 5; i++) {
				for (j = 0; j < 5; j++) {
					System.out.print(lake[i][j] + " ");
				}
				System.out.println();
			}
		}
		System.out.println("물고기를 모두 잡았습니다.");
	}
}
