package PrInheritance;

class Unit {
	int price;
	int hp;
	int power;
	int armor;
	String target;
	double speed;
	String type;

}

class Zergling extends Unit {

	Zergling() {
		super.price = 50;
		super.hp = 35;
		super.power = 5;
		super.armor = 0;
		super.target = "지상";
		super.speed = 2.612;
		super.type = "소형, 생체";
	}

	void print() {
		System.out.println("저글링의 생산비용은 미네랄 :" + super.price + ", 체력 : " + super.hp + ", 공격력 : " + super.power
				+ ", 방어력 : " + super.armor + ", 공격 유형 : " + super.target + ", 이동속도 : " + super.speed + ", 유닛 유형 : "
				+ super.type + "입니다.");
	}
}

class Hydra extends Unit {

	Hydra() {
		super.price = 75;
		super.hp = 80;
		super.power = 10;
		super.armor = 0;
		super.target = "지상, 공중";
		super.speed = 1.741;
		super.type = "중형, 생체";
	}

	void print() {
		System.out.println("히드라의 생산비용은 미네랄 :" + super.price + ", 체력 : " + super.hp + ", 공격력 : " + super.power
				+ ", 방어력 : " + super.armor + ", 공격 유형 : " + super.target + ", 이동속도 : " + super.speed + ", 유닛 유형 : "
				+ super.type + "입니다.");
	}
}

class Marine extends Unit {

	Marine() {
		super.price = 50;
		super.hp = 40;
		super.power = 5;
		super.armor = 0;
		super.target = "지상, 공중";
		super.speed = 1.875;
		super.type = "소형, 생체";
	}

	void print(int num) {
		System.out.println(num + "번 마린의 생산비용은 미네랄 :" + super.price + ", 체력 : " + super.hp + ", 공격력 : " + super.power
				+ ", 방어력 : " + super.armor + ", 공격 유형 : " + super.target + ", 이동속도 : " + super.speed + ", 유닛 유형 : "
				+ super.type + "입니다.");
	}
}

public class Starcraft {

	public static void main(String[] args) {

		Marine m[] = new Marine[3];
		Hydra h = new Hydra();
		Zergling z = new Zergling();

		for (int i = 0; i < m.length; i++) {
			m[i] = new Marine();
			m[i].print(i + 1);
		}

		h.print();
		z.print();

		int count = 0;

		while (true) {
			if (z == null && h == null) {
				break;
			}

			if (m[0] == null && m[1] == null && m[2] == null) {
				break;
			}
			
			// 테란
			if (z != null) {
				z.hp = z.hp - m[count++].power;
			} else {

			}

			if (z != null) {
				h.hp = h.hp - m[0].power;
			}

			// 저그
			for (int i = 0; i < m.length; i++) {
				if (m[i] != null) {
					if (z != null) {
						m[i].hp = m[i].hp - z.power;
						break;
					} else {
						m[i].hp = m[i].hp - h.power;
						break;
					}
				}
			}

			if (z != null && z.hp <= 0) { // null 포인트 에러
				z = null;
			}
			if (h != null && h.hp <= 0) {
				h = null;
			}
		}
	}

}
