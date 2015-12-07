package ex08_12;

public class InheritanceExample7 {
	public static void main(String args[]) {
		Account obj1 = new Account("111-22-333333", "임꺽정", 100000);
		CheckingAccount obj2 = new CheckingAccount("444-55-6666666", "홍길동", 20000, "5555-6666-7777-8888");
		CreditLineAccount obj3 = new CreditLineAccount("000-11-111111", "김선달", 10000, 20000000);
		BonusPointAccount obj4 = new BonusPointAccount("333-33-333333", "김미영", 0, 0);

		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);
	}

	static void printAccountInfo(Account obj) {
		// 다형성이 없다면 Account라고 쓰지 않고 일일이 파라미터 변수명으로 적었을텐데, 다형성으로 Account 슈퍼클래스만적어도 4개를 출력이 가능해진다!
		System.out.println("계좌번호 : " + obj.accountNo);
		System.out.println("예금주 이름 : " + obj.ownerName);
		System.out.println("잔액 : " + obj.balance);
		System.out.println();
	}
}
