package practice;

import java.util.Random;

public class QFour {

	public static void main(String[] args) {
		Random r = new Random();

		char a = 'A';

		String result = "";

		for (int i = 0; i < 10; i++) {
			int b = r.nextInt(26);
			char Ran = (char) (a + b);
			result += Ran;
		}
		System.out.println(result);
		
		int oneindex = r.nextInt(10);
		int twoindex = r.nextInt(10);
		int threeindex = r.nextInt(10);
		
		for (int i = 0; i < 3; i++) {
			int b = r.nextInt(10);
			char Rand = result.charAt(b);
			System.out.print(Rand);
		}
		
		while(oneindex == twoindex)
		{
			twoindex = r.nextInt(10);
		}
		while(oneindex == threeindex || twoindex == threeindex)
		{
			threeindex = r.nextInt(10);
		}
		
		System.out.println();
		System.out.print(oneindex);
		System.out.print(twoindex);
		System.out.println(threeindex);
		
		String str = result.charAt(oneindex)+"" + result.charAt(twoindex)+"" + result.charAt(threeindex) +"";
		System.out.println(str);

	}

}
