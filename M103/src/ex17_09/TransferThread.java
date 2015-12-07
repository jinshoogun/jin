package ex17_09;

public class TransferThread extends Thread {
	SharedArea sharedArea;

	TransferThread(SharedArea area) {
		sharedArea = area;
		
	}public void run() {
		for (int cnt = 0; cnt < 12; cnt++) {
			synchronized (sharedArea) {// µ¿±âÈ­ ½ÃÀÛ
				sharedArea.account1.withdraw(1000000);
				System.out.print("ÀÌ¸ù·æ °èÁÂ : 100¸¸¿ø ÀÎÃâ, ");
				sharedArea.account2.deposit(1000000);
				System.out.println("¼ºÃáÇâ °èÁÂ : 100¸¸¿ø ÀÔ±İ");
			}//µ¿±âÈ­³¡
		}
	}
}
