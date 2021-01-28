package PrClass;

public class Stationery {

	public static void main(String[] args) {
		Pencil Color = new Pencil();
//		Color.Red = "빨강";
//		Color.Blue = "파랑";
//		Color.Orange = "주황";
//		Color.Yellow = "노랑";
//		String write = Color.Write();
//		System.out.println(Color.Red + write);
//		System.out.println(Color.Blue + write);
//		System.out.println(Color.Orange + write);
//		System.out.println(Color.Yellow + write);
		
		Erazer Ez = new Erazer();
//		Ez.Jamjari = "잠자리";
//		Ez.MorningGlory = "모닝글로리";
//		String Eraze = Ez.Eraze();
//		System.out.println(Ez.Jamjari + Eraze);
//		System.out.println(Ez.MorningGlory + Eraze);
		
		Pen Pen = new Pen();
//		Pen.Black = "검정";
//		Pen.Green = "초록";
//		Pen.Babyblue = "베이비블루";
//		Pen.Monami = "모나미";
//		Pen.Jetstream = "제트스트림";
//		Pen.Waterman = "워터맨를";
//		String penwrite = Pen.Write();
//		String com = Pen.Company();
//		System.out.println(Pen.Monami + com + Pen.Black + penwrite);
//		System.out.println(Pen.Jetstream + com + Pen.Green + penwrite);
//		System.out.println(Pen.Waterman + com + Pen.Babyblue + penwrite);
	}
}

class Pencil{
//	String Red, Blue, Orange, Yellow;
	String color = "";
	public void write() {
		System.out.println("쓰는 기능은 " + color + "색 연필로 적습니다.");
	}
}

class Erazer{
//	String Jamjari, MorningGlory;
	String company = "";
	public void eraze() {
		System.out.println(company + "의 회사 제품으로 지웁니다.");
	}
}

class Pen{
	String Black, Green, Babyblue;
	String Monami, Jetstream, Waterman;
	public String Company() {
		return "제품의 ";
	}
	public String Write() {
		return "색 펜으로 씁니다.";
	}
	
}

class Color{
	String Red, Blue, Orange, Yellow, Black, Green, Babyblue;
}

class Factory{
	String Monami, Jetstream, Waterman;
}
class Write{
	
}
