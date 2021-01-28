package PrInheritance;


class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		setWeight(99);
	}
}
public class pr2 {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		System.out.printf("%d %d %d %s", s.age, s.height, s.getWeight(), s.name );
	}
}
