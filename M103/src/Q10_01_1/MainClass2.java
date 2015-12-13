package Q10_01_1;

public class MainClass2 {

	public static void main(String args[]) {
		APhone obj1 = new APhone();
		System.out.println("*****APhone 입니다.*****");
		printG(obj1);
		// 참조값에 의한 메소드 호출(Call by reference - 의 매개변수는 참조형(클래스, 배열, 인터페이스)을 사용)

		// 값 전달에 의한 메소드 호출(Call by value-매개변수는 기본 자료형을 사용)

		BPhone obj2 = new BPhone();
		System.out.println("*****BPhone 입니다.*****");
		printG(obj2);

		CPhone obj3 = new CPhone();
		System.out.println("*****CPhone 입니다.*****");
		printG(obj3);

	}

	static void printG(IFunction obj) {
		obj.callSenderReceive();
		obj.canLte();
		obj.tvRemoteController();
	}

}
