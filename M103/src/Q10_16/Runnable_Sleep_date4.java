package Q10_16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runnable_Sleep_date4{

	public static void main(String[] args) {

		//익명 구현 객체
		Runnable t = new Runnable() {
			public void run() {

				try {
					for (;;) {						
						SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일 E요일 aa HH시mm분ss초"); // 형식
						Date d = new Date(); // 오늘 시스템 날짜와 시간
						System.out.println(s.format(d));
						Thread.sleep(1000);
					
					}
				} catch (InterruptedException ie) {
					System.out.println(ie.toString());
				} // catch문 end
			}// run()end
		};// 
		
		Thread a = new Thread(t);
		a.start();

	}
}
