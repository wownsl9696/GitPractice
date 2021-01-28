package practice;

public class Star {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println("");
		}

		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++)
				System.out.print("*");
			for (int j = 5 - i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 3 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++)
				System.out.print("*");
			for (int j = 3 - i; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 2; i > 0; i--) {
			for (int j = 3 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++)
				System.out.print("*");
			for (int j = 3 - i; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
