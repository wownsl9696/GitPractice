package practice;

public class Quest_15_1 {

	public static void main(String[] args) {

//		normal();
//		change();
//		angle();
//		bangle();
		mabang();

	}

	public static void normal() {
		int user = 5;
		int a[][] = new int[user][user];
		int row, col;
		int i = 1;

		for (row = 0; row < a.length; row++) {
			for (col = 0; col < a[row].length; col++) {
				a[row][col] = i++;
				System.out.printf("%d\t", a[row][col]);
			}
			System.out.println();
		}
		System.out.println();

		int angle[][] = new int[5][5];
//		int row, col;
//		int i = 1;

		for (row = 0; row < 5; row++) {
			for (col = 4; col >= 0; col--) {
				angle[row][4 - col] = a[col][row];
			}
		}

		for (row = 0; row < 5; row++) {
			for (col = 0; col < 5; col++) {
				System.out.printf("%d\t", angle[row][col]);
			}
			System.out.println();
		}

	}

	public static void change() {
		int a[][] = new int[5][5];
		int row, col, turn, start, end, sw, k;
		turn = 0;
		start = 0;
		end = 4;
		sw = 1;
		k = 0;

		for (row = 0; row != a.length; row++) { // 행 0부터 a.length랑 같을때까지 row 1씩 증가
			for (col = start; col != (end + sw); col += sw) { // 열 = start 부터 end+sw 같을때 까지 col 은 col+sw 만큼 증가
				k++; // 만족시 k 1씩 증가
				a[row][col] = k;
//				System.out.print(a[row][col] + " ");
			}
			turn = start;
			start = end;
			end = turn;
			sw = sw * (-1);
//			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%d\t", a[i][j]);
			}
			System.out.println();
		}

	}

	public static void angle() {

	}

	public static void bangle() {

		int bangle[][] = new int[5][5];

		int row, col;
		int k = 1;
		int input = 5;
		int right = 0, bottom = -1;
		int reverse = 1;

		for (row = input; row >= 0; row--) {

			for (col = 0; col < input; col++) {
				bottom += reverse;
				bangle[right][bottom] = k++;
			}

			input--;

			for (col = 0; col < input; col++) {
				right += reverse;
				bangle[right][bottom] = k++;
			}

			reverse *= -1;
		}

		for (row = 0; row < bangle.length; row++) {
			for (col = 0; col < bangle[row].length; col++) {
				System.out.printf("%2d ", bangle[row][col]);
			}
			System.out.println("");
		}
	}

	public static void mabang() {

		int arr[][] = new int[5][5];
		int x = 0;
		int y = 2;
		int count = 1;

		while (count < 26) {
			arr[x][y] = count;

			int nx = x - 1;
			int ny = y + 1;
			if (nx == -1) {
				nx = 4;
			}
			if (ny == 5) {
				ny = 0;
			}
			if (arr[nx][ny] == 0) {
				x = nx;
				y = ny;
			} else {
				x += 1;
			}
			count++;
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
	}
}
