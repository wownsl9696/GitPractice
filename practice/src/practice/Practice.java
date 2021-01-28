package practice;

import java.util.Scanner;

public class Practice {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
//		time();
//		myinfo();
//		compare();
//		exam();
//		multiple();
//		score();
		pass();
//		grade();
	}
	
	public static void time() {
		
		System.out.print("정수 입력 : ");
		int time = sc.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.println(second + "초입니다.");
		sc.close();
	}
	
	public static void myinfo() {
		String name = sc.next();
		System.out.print("이름은 " + name + ", ");
		
		String city = sc.next();
		System.out.print("도시는 " + city + ", ");

		int age = sc.nextInt();
		System.out.print("나이는 " + age + "살, ");
		
		double weight = sc.nextDouble();
		System.out.print("몸무게는 " + weight + "kg, ");
		
		boolean isSingle = sc.nextBoolean();
		System.out.println("독신 여부는 " + isSingle + "입니다.");
		sc.close();
	}
	
	public static void compare() {
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		
		System.out.println((3>2) && (3>4));
		System.out.println((3 != 2) || (-1 > 0));
		System.out.println((3 != 2) ^ (-1 > 0));
		sc.close();
	}
	
	public static void exam() {
		System.out.print("점수를 입력하시오: ");
		int score = sc.nextInt();
		if (score >= 80)
			System.out.println("축하합니다! 합격입니다!");
		
		sc.close();
	}
	
	public static void multiple() {
		System.out.print("수를 입력하시오 : ");
		int number = sc.nextInt();
		if (number % 3 ==0)
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		
		sc.close();
	}
	
	public static void score() {
		char grade;
		
		System.out.print("정수 입력(0~100) : ");
		int score = sc.nextInt();
		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else
			grade = 'F';
		System.out.print("학점은 " + grade + "입니다.");
		sc.close();
	}

	public static void pass() {
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
		System.out.print("학년을 입력하세요(1~4) : ");
		int year = sc.nextInt();
		
		if(score >= 60) {
			if(year !=4)
				System.out.print("합격!");
			else if(score >= 70)
				System.out.print("합격!");
			else
				System.out.print("불합격!");
		}
		else
			System.out.print("불합격!");
		
		sc.close();
	}
		
	public static void grade() {
		char grade;
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade ='F';
		}
		System.out.println("학점은 " + grade + "입니다.");
		
		sc.close();
	}
}

	