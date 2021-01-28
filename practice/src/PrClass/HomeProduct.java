package PrClass;

import java.util.Scanner;

class Customer {
	int money;

	Computer buyCom[] = new Computer[10];
	AirCon buyAir[] = new AirCon[10];
	Refri buyRef[] = new Refri[10];
	AirClean buyClean[] = new AirClean[10];
}

class Computer {
	String maker = "";
	String cpu = "";
	int price;

	public void use() {
		System.out.println("제조사 " + maker + "회사의 " + cpu + " cpu 성능의 컴퓨터");
	}
}

class AirCon {
	String maker = "";
	String type = "";
	int price;

	public void use() {
		System.out.println("제조사 " + maker + "회사의 " + type + " 타입의 에어컨");
	}
}

class Refri {
	String maker = "";
	String door = "";
	String leter;
	int price;

	public void use() {
		System.out.println("제조사 " + maker + "회사의 " + leter + "L 용량의 " + door + "냉장고");
	}
}

class AirClean {
	String maker = "";
	int price;

	public void use() {
		System.out.println("제조사 " + maker + "회사의 공기청정기");
	}
}

class Mart {
	Computer c = new Computer();
	AirCon ac = new AirCon();
	Refri rf = new Refri();
	AirClean clean = new AirClean();
}

public class HomeProduct {
	static Scanner sc = new Scanner(System.in);

	public static int choice() {
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Mart mart = new Mart();

		System.out.println("1번 고객의 소지금을 입력하세요");
		System.out.println("2번 고객의 소지금을 입력하세요");
		System.out.println("3번 고객의 소지금을 입력하세요");

		System.out.println("1. 컴퓨터 / 2. 에어콘 / 3. 냉장고 / 4. 공기청정기");
		int num = choice();
		switch (num) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			System.out.println("1~4 숫자를 입력해주세요.");
			break;

		}
	}

}
