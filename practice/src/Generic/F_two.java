package Generic;

import java.io.FileWriter;
import java.util.Scanner;

public class F_two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		ArrayList<
		boolean game = true;
		while (game) {
			System.out.println("1. 입력  2. 검색  3. 삭제  4. 전체출력 5. 종료 :");
			int num = sc.nextInt();
			FileWriter fout = null;
			
			if (num == 1) {
				String name = sc.next();
				
			} else if (num == 2) {

			} else if (num == 3) {

			} else if (num == 4) {

			} else if (num == 5) {
				System.out.println("종료합니다..");
				game = false;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

}
