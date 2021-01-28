package practice;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();

		if (kor > 100 || eng > 100 || math > 100) {
			if (kor > 100)
				System.out.println("국어 점수가 잘 못 입력 됐습니다.");
			if (eng > 100)
				System.out.println("영어 점수가 잘 못 입력 됐습니다.");
			if (math > 100)
				System.out.println("수학 점수가 잘 못 입력 됐습니다.");
		}
		else {
			double avg;

			avg = ((double) kor + (double) eng + (double) math) / 3;

			System.out.printf("평균 : %.1f\n", avg);

			if (avg >= 95) {
				System.out.println("A+");
			} else if (avg >= 90) {
				System.out.println("A");
			} else if (avg >= 85) {
				System.out.println("B+");
			} else if (avg >= 80) {
				System.out.println("B");
			} else if (avg >= 75) {
				System.out.println("C+");
			} else if (avg >= 70) {
				System.out.println("C");
			} else if (avg >= 60) {
				System.out.println("D");
			} else
				System.out.println("F");
		}
		
		sc.close();
	}

}
