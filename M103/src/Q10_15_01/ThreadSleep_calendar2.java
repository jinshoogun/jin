package Q10_15_01;

import java.util.Calendar;

public class ThreadSleep_calendar2 extends Thread {
	@Override
	public void run() {

		while (true) {
			Calendar today = Calendar.getInstance();
			int year = today.get(Calendar.YEAR);
			int month = today.get(Calendar.MONTH) + 1;
			int date = today.get(Calendar.DATE);
			int hour = today.get(Calendar.HOUR_OF_DAY);
			int minute = today.get(Calendar.MINUTE);
			int second = today.get(Calendar.SECOND);
			System.out.println(year + "년" + month + "월" + date + "일 " + hour + "시" + minute + "분" + second + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				System.out.println(e.getMessage());
			}
		}
	}

}