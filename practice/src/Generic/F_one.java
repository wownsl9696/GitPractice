package Generic;

import java.util.ArrayList;
import java.util.Scanner;

public class F_one {

	public static void main(String[] args) {
//		Vector<Integer> num2 = new Vector<Integer>();
		ArrayList<String> s = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		boolean call = true;
		while (call) {
			System.out.print("1. 추가  2. 삭제  3. 전화번호 찾기  4. 전체 출력  5. 종료");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.print("1. 이름 : ");
				String name = sc.next();
				s.add(name);
				System.out.print("2. 전화번호 : ");
				String phone = sc.next();
				s.add(phone);
				System.out.print("3. 주소 : ");
				String address = sc.next();
				s.add(address);
				System.out.print("4. 성별 : ");
				String gender = sc.next();
				s.add(gender);
			} else if (num == 2) {
				System.out.print("이름 : ");
				String name = sc.next();
				if(name.equals(name)) {
					s.remove(0);
					System.out.println("전화번호가 삭제되었습니다.");
				} else {
					System.out.println("찾는 이름이 없습니다.");
				}
			} else if (num == 3) {
				System.out.print("이름 : ");
				String name = sc.next();
				if(name.equals(name)) {
					for(int i=0; i<s.size(); i++) {
						name = s.get(i);
						System.out.print(name + " ");
					}
				}
			} else if (num == 4) {

			} else if (num == 5) {
				System.out.println("프로그램 종료");
				call = false;
			} else {
				System.out.println("1~5이 아닌 숫자 입력은 잘못된 입력입니다.");
			}
		}
		sc.close();
	}
}
