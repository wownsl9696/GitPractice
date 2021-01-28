package Change;

import java.util.Random;

class Animal{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	void me() {
		System.out.println("나는 동물이다!");
	}
}

class Dog extends Animal{
	
	
	void me() {
		System.out.println("나는 " + getColor() + "색 강아지 입니다.");
	}
}

class Cat extends Animal{
	
	void me() {
		System.out.println("나는 " + getColor() + "색 고양이 입니다.");
	}
}

class Meucat extends Animal{
	
	void me() {
		System.out.println("나는 " + getColor() + "색 미어캣 입니다.");
	}
}

class Panda extends Animal{
	
	void me() {
		System.out.println("나는 " + getColor() + "색 판다 입니다.");
	}
}

public class T_Nine {

	public static void main(String[] args) {
		Random r = new Random();
		
		String color[] = {"빨강", "주황", "노랑", "초록", "파랑", "남", "보라"};

		Animal uri[] = new Animal[10];

		for(int i = 0; i<uri.length; i++) {
			int num = r.nextInt(4);
			if(num ==0) {	// 강아지
				uri[i] = new Dog();
				uri[i].setColor(color[r.nextInt(7)]);
				uri[i].me();
			} else if(num ==1) {	// 고양이
				uri[i] = new Cat();
				uri[i].setColor(color[r.nextInt(7)]);
				uri[i].me();
			} else if(num == 2) {	// 미어캣
				uri[i] = new Meucat();
				uri[i].setColor(color[r.nextInt(7)]);
				uri[i].me();
			} else if(num == 3) {	// 판다
				uri[i] = new Panda();
				uri[i].setColor(color[r.nextInt(7)]);
				uri[i].me();
			} else {
				System.out.println("랜덤수가 잘못되었습니다.");
			}
		}
	}

}
