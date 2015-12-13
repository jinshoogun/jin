package Q10_15_01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep_date2 extends Thread{
	@Override
	public void run() {

		try {
			for (;;) {
				//SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일 E요일 HH시mm분ss초"); // 형식
				SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일  HH시mm분ss초"); // 형식
				Date d = new Date(); // 오늘 시스템 날짜와 시간
				System.out.println(s.format(d));
				Thread.sleep(1000);
			}
		} catch (InterruptedException ie) {
			System.out.println(ie.toString());
		}

		/*
		 * while (true) { SimpleDateFormat s = new
		 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 형식 // // 지정 Date d = new
		 * Date(); // 오늘 시스템 날짜와 시간 System.out.println(s.format(d)); 
		 * try{
		 * Thread.sleep(1000); 
		 * }catch(InterruptedException ie){
		 * System.out.println(ie.toString()); } 
		 * }
		 */
	}
}
