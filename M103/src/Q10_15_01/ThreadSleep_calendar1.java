package Q10_15_01;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class ThreadSleep_calendar1 extends Thread {
	@Override
	public void run() {

		while (true) {
			try {
				GregorianCalendar calendar = new GregorianCalendar();
				SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy�� MM�� dd��  HH�� mm�� ss��");
				dateFormat1.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
				String str = dateFormat1.format(calendar.getTime());//Date�� -> String��
				System.out.println(str);
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}