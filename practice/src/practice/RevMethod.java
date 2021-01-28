package practice;

import java.util.Scanner;

public class RevMethod {

	public static void main(String[] args) {
		reverse();
	}
	
	public static int[][] seats() {
		int seat[][] = new int[9][2];
		return seat;
	}
	
	public static void compare(int a[][], int row, int col) {
		if(a[row][col] == 0) {
			System.out.println("예약이 완료되었습니다.");
			a[row][col] =1;
//			limit--;
		}
		else{
			output(a);
		}
	}
	public static int input() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		return a;
	}
	
	public static void error() {
		System.out.println("잘못된 입력입니다.");
	}
	
	public static void reverse() {
		int limit = 18;
		while (limit >0) {
			System.out.println("예약하실 좌석을 입력해주세요(총 18석) : ");
			int row = input();
			int col = input();

			if (row > 8 || row < 0 || col > 1 || col < 0) {
				error();
				continue;
			}
			compare(seats(), row, col);
		}
	}
	public static int[][] output(int a[][]){
		int b[][] = a;
		System.out.println("예약이 완료된 자리입니다.");
		System.out.println("비어있는 좌석은 ");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 2; j++) {
				if (a[i][j] == 0)
					System.out.printf("%d%d ", i, j);
			}
			System.out.println();
		}
		System.out.println("입니다.");
		return b;
	}
}
