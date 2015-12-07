package Q10_15_01;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class ThreadSleep_calendar3 extends Thread {
	public void run() {
		int i = 1;
		for (;;) {
			GregorianCalendar gc = new GregorianCalendar();
			SimpleDateFormat df = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
			df.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
			String str = df.format(gc.getTime());
			System.out.println("inedx  = " + (i++) + "/ " + str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}