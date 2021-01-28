package practice;

import java.util.Scanner;

public class Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("월을 입력(1~12) : ");
		int month = sc.nextInt();
		System.out.print("온도를 입력(-15.0 ~ 37.0) : ");
		double temp = sc.nextDouble();
		
		if(!(month > 12 || month < 1 || temp > 37.0 || temp < -15.0))
			if ((month >= 3 && month <= 5) && (temp >= 3.0 && temp <= 15.0)) {
				System.out.println("계절은 봄입니다. " + "온도는 " + temp + "도입니다.");
			} 
			else if ((month >= 6 && month <= 8) && (temp >= 18.0 && temp <= 37.0)) {
				System.out.println("계절은 여름입니다. " + "온도는 " + temp + "도입니다.");
			}
			else if ((month >= 9 && month <= 11) && (temp >= 3.0 && temp <= 15.0)) {
				System.out.println("계절은 가을입니다. " + "온도는 " + temp + "도입니다.");
			}
			else if ((month == 12 || (month <= 2 && month >= 1)) && (temp >= -15.0 && temp <= 2.0)) {
				System.out.println("계절은 겨울입니다. " + "온도는 " + temp + "도입니다.");
			}
			else
				System.out.println("계절과 온도가 맞지않습니다.");
		else {
			System.out.println("잘못된 입력입니다.");
		}
		
		sc.close();
	}
}
