package PrClass;

class Animal {
	private String name = "";
	private String food = "";

	// 중요 진짜 많이씀 Spring
	void SetName(String name) {
		// 기록을 남길 수 있다.
		this.name = name;
	}
	
	String GetName() {
		return this.name;
	}
	
	void SetFood(String Food) {
		this.food = Food;
	}
	
	void Display() {
	}
}

class Feed {
	void have(String food) {
		System.out.println(food + "를 들고 있습니다.");
	}
}

public class Animals {

	

	public static void main(String[] args) {

	}
}
