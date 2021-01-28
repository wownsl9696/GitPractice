package PrInheritance;

import java.util.Random;


class Animal {
	private String name;
	private String color;

	void setname(String name) {
		this.name = name;
	}

	String getname() {
		return this.name;
	}

	void setcolor(String color) {
		this.color = color;
	}

	String getcolor() {
		return this.color;
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println(getcolor() + "의 " + getname()+ "는(은) 짖는다.");
	}
}

class Cat extends Animal {
	void maw() {
		System.out.println(getcolor() + "의 " + getname() + "는(은) 야옹한다.");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println(getcolor() + "의 " + getname() + "는(은) 날아다닌다.");
	}
}

public class TFive {

	public static void main(String[] args) {
		Random r = new Random();
		
//		Animal[] a = new Animal[6];

		Dog[] d = new Dog[3];
		Cat[] c = new Cat[2];
		Bird b = new Bird();
		
		String dsort[] = {"말티즈", "요크셔테리어", "포메라니안", "시바", "웰시코기"};
		String csort[] = {"먼치킨", "스핑크스", "뱅갈", "샴", "폴드"};
		String bsort[] = { "앵무새", "참새", "닭", "까마귀", "비둘기" };
		
		String color[] = { "갈색", "검은색", "흰색", "노란색", "점박이"};

		for (int i = 0; i < 3; i++) {
			int num1 = r.nextInt(5);
			int num2 = r.nextInt(5);
			d[i] = new Dog();
			d[i].setname(dsort[num1]);
			d[i].setcolor(color[num2]);
			d[i].bark();
		}
		for (int i = 0; i < 2; i++) {
			int num1 = r.nextInt(5);
			int num2 = r.nextInt(5);
			c[i] = new Cat();
			c[i].setname(csort[num1]);
			c[i].setcolor(color[num2]);
			c[i].maw();
		}
		
		int num3 = r.nextInt(5);
		int num4 = r.nextInt(5);
		b.setname(bsort[num3]);
		b.setcolor(color[num4]);
		b.fly();
	}
}