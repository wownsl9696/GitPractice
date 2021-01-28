package PrClass;

public class Circle {

	int r;
	String name;

	public Circle() {
	}

	public double getArea() {
		return 3.14 * r * r;
	}

	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
		pizza.r = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.r = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
