package Q10_15_01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep_date2 extends Thread{
	@Override
	public void run() {

		try {
			for (;;) {
				//SimpleDateFormat s = new SimpleDateFormat("yyyy��MM��dd�� E���� HH��mm��ss��"); // ����
				SimpleDateFormat s = new SimpleDateFormat("yyyy��MM��dd��  HH��mm��ss��"); // ����
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
