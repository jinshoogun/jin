package ex17_11;
//계좌이체와 잔액 합계 출력을 동시에 하는 멀티 스레드 프로그램
// 이몽룡의 계좌에서 인출된 100만원이 성춘향의 계좌로 입금되기전에
//PrintThread 실행의 제어가 넘어가 계좌 잔액 합계가 290000000 출력되었다.
//문제해결법 : 동기화 (공유데이터 사용 중에 그 공유데이터를 다른 스레이드가 사용하지 못하도록 만드는 것을 의미)

public class MultithreadExample5 {
	public static void main(String args[]) {
		SharedArea area = new SharedArea();
		area.account1 = new Account("111-111-1111", "이몽룡", 20000000);
		area.account2 = new Account("222-222-2222", "성춘향", 10000000);
		TransferThread thread1 = new TransferThread(area);
		PrintThread thread2 = new PrintThread(area);
		thread1.start();
		thread2.start();
	}
}
