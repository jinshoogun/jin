package Q10_16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runnable_Sleep_date3 implements Runnable {

	public static void main(String[] args) {
		Runnable_Sleep_date3 ts = new Runnable_Sleep_date3();
		Thread t = new Thread(ts);
		t.start();
	}

	@Override
	public void run() {

		try {
			for (;;) {
				SimpleDateFormat s = new SimpleDateFormat("yyyy��MM��dd�� E���� aa HH��mm��ss��"); // ����
				Date d = new Date(); // ���� �ý��� ��¥�� �ð�
				System.out.println(s.format(d));
				Thread.sleep(1000);
			}
		} catch (InterruptedException ie) {
			System.out.println(ie.toString());
		}

		/*
		 * while (true) { SimpleDateFormat s = new
		 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // ���� // // ���� Date d = new
		 * Date(); // ���� �ý��� ��¥�� �ð� System.out.println(s.format(d)); 
		 * try{
		 * Thread.sleep(1000); 
		 * }catch(InterruptedException ie){
		 * System.out.println(ie.toString()); } 
		 * }
		 */
	}
}

