package practice;

import java.util.Scanner;

public class ExamMethod {



	public static void main(String[] args) {
		Result(Grade(Avg(Kor(), Eng(), Math())));
//		System.out.println();
	}

	public static int Kor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		int a = sc.nextInt();
		return a;
	}

	public static int Eng() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어 점수 입력 : ");
		int a = sc.nextInt();
		return a;
	}

	public static int Math() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수학 점수 입력 : ");
		int a = sc.nextInt();
		return a;
	}

	public static double Avg(int a, int b, int c) {
		if (a > 100 || b > 100 || c > 100) {
			error();
			return -1;
		} else if( a < 0 || b < 0 || c < 0) {
			error();
			return -1;
		}
		else {
			double avg = ((double) a + (double) b + (double) c) / 3.0;
			return avg;
		}
	}

	public static String Grade(double grade) {
		String result = null;

		if (grade >= 95) {
			result = "A+";
		} else if (grade >= 90) {
			result = "A";
		} else if (grade >= 85) {
			result = "B+";
		} else if (grade >= 80) {
			result = "B";
		} else if (grade >= 75) {
			result = "C+";
		} else if (grade >= 70) {
			result = "C";
		} else if (grade >= 60) {
			result = "D";
		} else if (grade < 0)
			result = null;
		else {
			result = "F";
		}
		return result;
	}

	public static void Result(String a) {
		if ( a == null)
			System.out.println("");
		else
			System.out.println("평균 학점 : " + a);
	}

	public static void error() {
		System.out.println("잘못된 입력입니다.");
	}
}
