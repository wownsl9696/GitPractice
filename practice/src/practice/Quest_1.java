package practice;

import java.util.Random;

public class Quest_1 {

	public static void main(String[] args) {
		Random r = new Random();

		int Ar[] = new int[11];
		int max = 0;
		for (int i = 0; i < Ar.length - 1; i++) {
			Ar[i] = r.nextInt(Ar.length);
			System.out.print(Ar[i] + " ");
		}
		for (int i = 0; i < Ar.length - 1; i++) {
			if (Ar[i] > max) {
				max = Ar[i];
			}
		}
		System.out.print("\n가장 큰 수의 인덱스 :");
		for (int i = 0; i < Ar.length -1; i++) {
			if(Ar[i] == max) {
				System.out.print(" " + i);
			}
		}
//		System.out.println("\n가장 큰 수 : " + i + "\n 인덱스 : " + max);
	}

}
