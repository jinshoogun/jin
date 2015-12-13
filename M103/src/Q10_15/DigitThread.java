package Q10_15;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DigitThread extends Thread {

	public void run() {

		while (true) {
			GregorianCalendar calendar = new GregorianCalendar();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 aa HH시 mm분 ss초");
			String str = dateFormat.format(calendar.getTime());
			System.out.println(str);
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				System.out.println(e.getMessage());

			}

		}
	}
}
