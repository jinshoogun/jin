package ex11_06;

import java.sql.Timestamp;   
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
	public static void main(String args[]) {
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy�� MM�� dd��"); //�ΰ��� 08�� ǥ�� �ϳ��� 8�� ǥ��

		Date d = new Date(); // ���� �ý��� ��¥�� �ð�
		System.out.println(d);
		System.out.println(new Date());
		System.out.println(sd1.format(d)); // �� �� �� ���·� ���
		System.out.println(sd2.format(d)); // �� �� �� ���·� ���

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss�� E����");
		// E : ������ �ѱ��̶� �ѱ���� ���, ���������� ����� �ϸ� ����� ���

		// �ý��� �и��� ���ϱ� (����ǥ�ؽð� (UTC,GMT))
		// 1970/1/1/0/0/0���� ���� ����� �ð�
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		//�� �ι���� ��ġ
		System.out.println(new Timestamp(System.currentTimeMillis()));
		                                 //���۷��� ����
		System.out.println(sdf.format(ts));

	}

}
