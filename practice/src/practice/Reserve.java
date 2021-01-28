package practice;

import java.util.Scanner;

public class Reserve {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int seat[][] = new int[9][2];
		int row, col;
		int limit = 18;

		while (limit > 0) {
			System.out.println("예약하실 좌석을 입력해주세요(총 18석) : ");
			row = sc.nextInt();
			col = sc.nextInt();

			if ((row > 8 || row < 0) || (col > 1 || col < 0)) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			if (seat[row][col] == 0) {
				System.out.println("예약이 완료되었습니다.");
				seat[row][col] = 1;
				limit--;
			} else {
				System.out.println("예약이 완료된 자리입니다.");
				System.out.println("비어있는 좌석은 ");
				for (int i = 0; i < 9; i++) {
					for (int j = 0; j < 2; j++) {
						if (seat[i][j] == 0)
							System.out.printf("%d%d ", i, j);
					}
					System.out.println();
				}
				System.out.println("입니다.");
			}
		}
	}
}
