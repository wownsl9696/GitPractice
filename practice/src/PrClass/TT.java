package PrClass;

import java.util.Random;

class Monkey {

	String color;
	Box box = null;

	void setcolor(String color) {
		this.color = color;
	}

	String getcolor() {
		return this.color;
	}

	void have() {
		System.out.printf("%s원숭이는 상자를 가지고 있습니다.\n", this.color);
	}
}

class Box {

}

public class TT {

	public static void main(String[] args) {

		Monkey[] mk = new Monkey[5];
		Box box = new Box();
		String color[] = { "빨강", "노랑", "파랑", "초록", "검정" };

//		mk[0].setcolor("빨강");
//		mk[1].setcolor("노랑");
//		mk[2].setcolor("파랑");
//		mk[3].setcolor("초록");
//		mk[4].setcolor("검정");

		for (int i = 0; i < 5; i++) {
			mk[i] = new Monkey();
			mk[i].color = color[i];
		}

		mk[0].box = box; // 빨강 원숭이 상자객체를 준다.

		Random r = new Random();
		String tmpColor = "";

		int rl = r.nextInt(2);
		int count = r.nextInt(5) + 1;

		System.out.printf("%d / %d\n", rl, count);

		if (rl == 0) {
			for (int i = 0; i < count; i++) {
				if (i + 1 == 5) {
					tmpColor = mk[i].getcolor();
					mk[i].setcolor(mk[i].getcolor());
					mk[i].setcolor(tmpColor);
				}
			}
		} else {
			for (int i = 1; i <= count; i++) {
				tmpColor = mk[i].getcolor();
//				mk[i].setcolor(mk[5].getcolor());
				mk[5].setcolor(mk[4].getcolor());
				mk[4].setcolor(mk[3].getcolor());
				mk[3].setcolor(mk[2].getcolor());
				mk[2].setcolor(tmpColor);
			}
		}

		for (int i = 0; i < count; i++) {
			mk[i].have();
		}
	}

}