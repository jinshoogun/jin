package Q10_15_01;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep_date3 extends Thread {

	public static void main(String[] args) {

		Thread t = new ThreadSleep_date3() {
			public void run() {

				try {
					for (;;) {
						// SimpleDateFormat s = new
						// SimpleDateFormat("yyyy년MM월dd일 E요일 HH시mm분ss초"); // 형식
						SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일  HH시mm분ss초"); // 형식
						Date d = new Date(); // 오늘 시스템 날짜와 시간
						System.out.println(s.format(d));
						Thread.sleep(1000);
					}
				} catch (InterruptedException ie) {
					System.out.println(ie.toString());
				} // catch문 end
			}// run()end
		};// ThreadSleep_date3 end

		t.start();

	}
}