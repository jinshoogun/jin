package ex08_16;

public class InterfaceExample2 {
	public static void main(String args[]) {

		SeparateVolume obj = new SeparateVolume("863ㅂ", "나무", "베르나르 베르베르");
		printState(obj);
		
		obj.checkOut("이수경", "20060317");
		printState(obj);

	}

	static void printState(SeparateVolume obj) {
// System.out.println("obj.state = " + obj.state);
		if (obj.state == Lendable.STATE_NORMAL) { //STATE_NORMAL = 0
			System.out.println("-------------"); // 인터페이스 구현하지 않는 클래스인데 쓰고 싶으면(인터페이스명.상수명)
			System.out.println("대출상태  : 대출 가능");
			System.out.println("-------------");
		}
		if (obj.state == Lendable.STATE_BORROWED) {//STATE_BORROWED = 1
			System.out.println("-------------");
			System.out.println("대출상태  : 대출 중");
			System.out.println("대출인 : " + obj.borrower);
			System.out.println("대출일 : " + obj.checkOutDate);
			System.out.println("-------------");
		}
	}

}
