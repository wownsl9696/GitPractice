package practice;

import java.util.Random;
import java.util.Scanner;

public class QuestFisrt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		char c = 'A' ;
		int a = r.nextInt(26);
		char Ran = (char) (c + a);
		System.out.println(Ran);
		
	}

}
