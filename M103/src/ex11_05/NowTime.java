package ex11_05;

import java.util.Calendar;

public class NowTime {
	public static void main(String args[]) {
		Calendar today = Calendar.getInstance();

		int m;
		String M;
		m = (today.get(Calendar.AM_PM));
		if (m == 0)
			M = "����";
		else
			M = "����";

		int d;
		String D;
		d = today.get(Calendar.DAY_OF_WEEK);

		if (d == 1)
			D = "�Ͽ���";
		else if (d == 2)
			D = "������";
		else if (d == 3)
			D = "ȭ����";
		else if (d == 4)
			D = "������";
		else if (d == 5)
			D = "�����";
		else if (d == 6)
			D = "�ݿ���";
		else
			D = "�����";

		System.out.println(today.get(Calendar.YEAR) + "�� " + (today.get(Calendar.MONTH) + 1) + "�� "
				+ today.get(Calendar.DATE) + "�� " + M + " " + today.get(Calendar.HOUR) + ":"
				+ today.get(Calendar.MINUTE) + ":" + today.get(Calendar.SECOND) + " " + D + "�Դϴ�.");
	}

}
