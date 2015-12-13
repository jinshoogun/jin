package ex09_03;

//obj 변수의 타입이 Account이기 때문에 Account에 없는 pay 메소드나 cardNo필드는 컴파일러 에러 발생
public class RefTypeExample6 {
	public static void main(String args[]) {
		// 1
		// Account obj = new CheckingAccount("111-22-333333", "홍길동", 10,
		// "4444-5555-6666-7777");
		// obj 변수의 타입이 Account이기 때문에 Account에 없는 pay 메소드나 cardNo필드는 컴파일러 에러 발생

		// 2
		// Account obj1 = new CheckingAccount("111-22-333333", "홍길동", 10,
		// "4444-5555-6666-7777");
		// CheckingAccount obj2 = (CheckingAccount)obj1;
		// 컴파일러는 변수의 타입만 보고 대입가능성을 검사하기 때문에 에러 발생

		Account obj1 = new CheckingAccount("111-22-333333", "홍길동", 10000000, "4444-5555-6666-7777");
		// 업캐스팅 (자식 클라스가 부모클래스에게 호출하는 형태)
		// 형변환 생략 가능 (컴파일러에 의한 임시적 형변환)
		// 자식클래스의 오버라이딩 된 메소드를 호출(참조영역이 축소된다.)
		
		CheckingAccount obj2 = (CheckingAccount) obj1;
		// int x = (int) x 이 형식을 생각해보아라!
		
		// 다운 캐스팅
		// 부모클래스가 자식클래스에게 호출하는 형태
		// 형변환 명시
		// 조건 사전에 업캐스팅한 것에 대해서만 다운 캐스팅 허용한다.
		// 상속받은 부모의 메소드도 호출 가능(참조영역 확대)
		try {
			int amount = obj2.pay("4444-5555-6666-7777", 47000);
			System.out.println("인출액 = " + amount);
			System.out.println("카드번호 = " + obj2.cardNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
