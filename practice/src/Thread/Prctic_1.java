package Thread;

import java.util.Scanner;

class numThread implements Runnable{
	public void run() {
		System.out.println("스레드 실행 시작");
		for(int i = 1; i<=10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n스레드 종료");
	}
}


public class Prctic_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아무 키나 입력>> ");
		sc.nextLine();
		
		Thread th = new Thread(new numThread());
		
		th.start();
	}
}

