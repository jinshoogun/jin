package ex17_11;

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
	// 동기화 방법 2.메소드안에 있는 명령문 전체가 동기화 블록이고, 
	// 그동기화 불럭이 this 객체에 대한 것일 경우
	// synchronized 메소드 선언 {
	// 임계영역 코딩
	// }

	// 동기화 메소소소오드
	synchronized void transfer(int amount) { // 계좌이체를 한다.
			account1.withdraw(1000000);
			System.out.print("이몽룡 계좌 : 100만원 인출, ");
			account2.deposit(1000000);
			System.out.println("성춘향 계좌 : 100만원 입금");
	}
	
	// 동기화 메소소소오드
	synchronized int getTotal(){ //잔액 합계를 구한다.
			return account1.balance + account2.balance;
	}
}
