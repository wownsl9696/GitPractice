package PrClass;

class Cars {
	String color = "";
	String maker = "";
	int fast = 0;

	public void drive() {
		System.out.println(maker + "회사의 " + fast + "의 최고속력을 가진 " + color + "색의 자동차를 소유.");
	}
}

class Bike {
	String maker = "";
	String stat = "";
	
	public void ride() {
		System.out.println(maker + "회사의 " + stat + "의 기능을 가진 자전거를 소유.");
	}
}

class Motocycle {
	String maker = "";
	String color = "";
	int fast = 180;
	
	public void drive() {
		System.out.println(maker + "회사의 " + fast + "의 최고속력을 가진 " + color + "색의 오토바이를 소유.");
	}
}
class All{
	Cars cars1 = new Cars();
	Cars cars2 = new Cars();
	Cars cars3 = new Cars();
	Cars cars4 = new Cars();
	Bike bike1 = new Bike();
	Bike bike2 = new Bike();
	Motocycle mcc = new Motocycle();
}

class Person1{
	Cars cars1;
	Cars cars2;
}
class Person2{
	Bike bike1;
	Motocycle mcc;
}
public class Vehicle {
	public static void main(String[] args) {
		All all = new All();
		Person1 p1 = new Person1();
		Person2 p2 = new Person2();
		
		all.cars1.color = "은";
		all.cars2.color = "검정";
		all.cars3.color = "하얀";
		all.cars4.color = "형광";
		
		all.cars1.maker = "Ford";
		all.cars2.maker = "BMW";
		all.cars3.maker = "삼성";
		all.cars4.maker = "현대";
		
		all.cars1.fast = 220;
		all.cars2.fast = 240;
		all.cars3.fast = 200;
		all.cars4.fast = 180;
		
		all.bike1.maker = "삼천리";
		all.bike2.maker = "자이언트";
		all.bike1.stat = "산악용";
		all.bike2.stat = "접이식용";
		
		all.mcc.maker = "대림";
		all.mcc.color = "빨강";
		all.mcc.fast = 180;
		
		
		p1.cars1 = all.cars2;
		p1.cars2 = all.cars4;
		
		p2.bike1 = all.bike1;
		p2.mcc = all.mcc;
		
		all.cars2.drive();
		all.cars4.drive();
		
		all.bike1.ride();
		all.mcc.drive();
	}
}