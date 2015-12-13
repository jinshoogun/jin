package Q10_16;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DigitThread implements Runnable {

	public void run() {

		while (true) {
			GregorianCalendar calendar = new GregorianCalendar();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 aa hh시 mm분 ss초");
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
