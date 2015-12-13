package ex17_10;

// 공유영역 클래스
public class SharedArea {
	Account account1; // 이몽룡 계좌
	Account account2; // 성춘향 계좌

	// 동기화 방법1.
	// 메서드 선언{
	// synchronized (동기화할 객체 또는 클래스명) {
	// 임계영역 코딩
	// }
	// }
	//
	// 동기화 방법 2.
	// synchronized 메소드 선언 {
	// 임계영역 코딩
	// }

	void transfer(int amount) { // 계좌이체를 한다.
		synchronized (this) {
			account1.withdraw(1000000);
			System.out.print("이몽룡 계좌 : 100만원 인출, ");
			account2.deposit(1000000);
			System.out.println("성춘향 계좌 : 100만원 입금");
		}
	}

	int getTotal(){ //잔액 합계를 구한다.
		synchronized (this) {
			return account1.balance + account2.balance;
		}
	}
}
