package ex11_05;

import java.util.Calendar;

public class NowTime {
	public static void main(String args[]) {
		Calendar today = Calendar.getInstance();

		int m;
		String M;
		m = (today.get(Calendar.AM_PM));
		if (m == 0)
			M = "오전";
		else
			M = "오후";

		int d;
		String D;
		d = today.get(Calendar.DAY_OF_WEEK);

		if (d == 1)
			D = "일요일";
		else if (d == 2)
			D = "월요일";
		else if (d == 3)
			D = "화요일";
		else if (d == 4)
			D = "수요일";
		else if (d == 5)
			D = "목요일";
		else if (d == 6)
			D = "금요일";
		else
			D = "토요일";

		System.out.println(today.get(Calendar.YEAR) + "년 " + (today.get(Calendar.MONTH) + 1) + "월 "
				+ today.get(Calendar.DATE) + "일 " + M + " " + today.get(Calendar.HOUR) + ":"
				+ today.get(Calendar.MINUTE) + ":" + today.get(Calendar.SECOND) + " " + D + "입니다.");
	}

}
