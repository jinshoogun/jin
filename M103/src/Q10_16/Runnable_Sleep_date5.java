//Runnable �̿��� ��
//sleep()�� �̿��ؼ� ���ϴ� �ð� ��ŭ block ���¿� ��Ʈ�� �� �ִ�.
//1�ʸ��� �ð� ǥ�� �� �ִ� ���α׷�
package Q10_16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runnable_Sleep_date5{

	public static void main(String[] args) {

		//�͸� ���� ��ü -> ���ٽ����� ǥ��
		Runnable t = ()-> {
				try {
					for (;;) {						
						SimpleDateFormat s = new SimpleDateFormat("yyyy��MM��dd��  HH��mm��ss��"); // ����
						Date d = new Date(); // ���� �ý��� ��¥�� �ð�
						System.out.println(s.format(d));
						Thread.sleep(1000);
					}
				} catch (InterruptedException ie) {
					System.out.println(ie.toString());
				} // catch�� end
		};// 
		
		Thread a = new Thread(t);
		a.start();

	}
}
