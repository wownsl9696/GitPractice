package AbstractC;

interface Repairable {

}

class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

class Unit {
	int hitpoint;
	final int MAX_UP;

	Unit(int hp) {
		MAX_UP = hp;
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitpoint = MAX_UP;
	}

	public String toString() {
		return "Tank";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitpoint = MAX_UP;
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV(){
		super(60);
		hitpoint = MAX_UP;
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitpoint != u.MAX_UP) {
				u.hitpoint++;
			}
		}
	}
}

public class StarCraft {

	public static void main(String[] args) {
		Tank t = new Tank();
		Marine m = new Marine();
		SCV s = new SCV();

		s.repair(t);
//		s.repair(m);
	}

}
