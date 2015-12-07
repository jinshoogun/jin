//Runnable 이용한 예
//sleep()을 이용해서 원하는 시간 만큼 block 상태에 빠트릴 수 있다.
//1초마다 시간 표시 해 주는 프로그램
package Q10_16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runnable_Sleep_date5{

	public static void main(String[] args) {

		//익명 구현 객체 -> 람다식으로 표현
		Runnable t = ()-> {
				try {
					for (;;) {						
						SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일  HH시mm분ss초"); // 형식
						Date d = new Date(); // 오늘 시스템 날짜와 시간
						System.out.println(s.format(d));
						Thread.sleep(1000);
					}
				} catch (InterruptedException ie) {
					System.out.println(ie.toString());
				} // catch문 end
		};// 
		
		Thread a = new Thread(t);
		a.start();

	}
}
