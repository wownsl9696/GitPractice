package PrInheritance;

class Dinosaur{
	int h;
	int w;
	String name;
	
	void shout() {
		System.out.println("나는 공룡이다!");
	}
}

class Tirano extends Dinosaur{
	Tirano(){
		super.h = 2;
		super.w = 1;
		super.name = "티라노사우르스";
	}
	
	void shout() {
		System.out.println("나는 키 "+ h +"m 몸무게 " + w + "톤인 " + name + "다.");
	}
}

class Trike extends Dinosaur{
	Trike(){
		super.h = 3;
		super.w = 2;
		super.name = "티리케라톱스";
	}
	
	void shout() {
		System.out.println("나는 키 "+ h +"m 몸무게 " + w + "톤인 " + name + "다.");
	}
}

class Buk extends Dinosaur{
	Buk(){
		super.h = 5;
		super.w = 3;
		super.name = "부경사우르스";
	}
	
	void shout() {
		System.out.println("나는 키 "+ h +"m 몸무게 " + w + "톤인 " + name + "다.");
	}
}

public class T_Eight {
	static void print(Dinosaur d) {
		d.shout();
	}
	
	public static void main(String[] args) {
		print(new Tirano());
		print(new Trike());
		print(new Buk());
	}

}
