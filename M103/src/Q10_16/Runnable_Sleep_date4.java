package Q10_16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runnable_Sleep_date4{

	public static void main(String[] args) {

		//�͸� ���� ��ü
		Runnable t = new Runnable() {
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
				} // catch�� end
			}// run()end
		};// 
		
		Thread a = new Thread(t);
		a.start();

	}
}
