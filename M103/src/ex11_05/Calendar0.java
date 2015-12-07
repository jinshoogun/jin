package ex11_05;

import java.util.Calendar;

public class Calendar0 {
	public static void main(String args[]) {

		Calendar today = Calendar.getInstance();

		System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));

		System.out.println("월 (0~11, 0:1월) : " + today.get(Calendar.MONTH)); //시작은 1월은 0으로 표기~
		System.out.println("월 (0~11, 0:1월) : " + (today.get(Calendar.MONTH) + 1)); //그래서 +1한다

		System.out.println("이 해의 몇번째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇번째 주 : " + today.get(Calendar.WEEK_OF_MONTH));

		System.out.println("이 달의 몇일 : " + today.get(Calendar.DATE));
		System.out.println("이 달의 몇일 : " + today.get(Calendar.DAY_OF_MONTH));

		System.out.println("이 해의 몇일 : " + today.get(Calendar.DAY_OF_YEAR)); //여기서는 시작은 1부터 표기 1은 일요일
		System.out.println("요일 (1~7, 1:일요일): " + today.get(Calendar.DAY_OF_WEEK));

		System.out.println("이 달의 몇번 째 요일: " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전_오후(0:오전, 1:오후): " + today.get(Calendar.AM_PM)); // 여기는 0부터 시작

		System.out.println("시간(0~11): " + today.get(Calendar.HOUR)); // 여기는 0부터 시작
		System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));

		System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59): " + today.get(Calendar.SECOND));
		
		System.out.println("1000분의 1초(0~999): "+ today.get(Calendar.MILLISECOND));
		System.out.println("이달의 마지막 날: "+ today.getActualMaximum(Calendar.DATE));

		
		
	}
}
