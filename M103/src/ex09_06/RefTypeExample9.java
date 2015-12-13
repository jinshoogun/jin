package ex09_06;

// 컴파일 에러는 없으나 실행에러 발생
public class RefTypeExample9 {
	public static void main(String args[]) {
		Account obj1 = new Account("111-22-333333", "홍길동", 10000000);
		// 씨부렁씨부렁 .. cannot be cast to ..씨부렁씨부렁 - 업캐스팅 후 다운 캐스팅해야 되는데 업캐스팅없이 다운
		// 캐스팅하려고 하니 에러뜸 빼액액액액액!!!
		// 고로 자녀클래스인 new CheckingAccount로 수정해야됩니다.(업캐스팅 해야되니깐요)
		CheckingAccount obj2 = (CheckingAccount) obj1;

		try {
			int amount = obj2.pay("4444-5555-6666-7777", 47000);
			System.out.println("인출액 = " + amount);
			System.out.println("카드번호 = " + obj2.cardNo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
