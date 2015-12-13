package ex09_07;

public class RefTypeExample10 {
	public static void main(String args[]) {
		Account obj = new Account("111-22-333333", "홍길동", 10000000);
		if (obj instanceof CheckingAccount) // 캐스트 타입 여부 검사 오다
			pay((CheckingAccount) obj);
		else
			System.out.println("캐스트 할 수 없는 타입입니다.");
	}

	static void pay(CheckingAccount obj) {
		try {
			int amount = obj.pay("4444-5555-6666-7777", 47000);
			System.out.println("인출액 = " + amount);
			System.out.println("카드번호 = " + obj.cardNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
