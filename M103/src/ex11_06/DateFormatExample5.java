package ex11_06;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateFormatExample5 {
	public static void main(String args[]){
		GregorianCalendar calendar = new GregorianCalendar();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		
		// �̱�, ������ TimeZone��ü�� ������ setTimeZone�޼ҵ带 ȣ����.
		dateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		String str = dateFormat.format(calendar.getTime());
		
		// �ƽþ�, ȫ���� TimeZone��ü�� ������ setTimeZone�޼ҵ带 ȣ����.
		dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Hong_Kong"));
		String str1 = dateFormat.format(calendar.getTime());
		
		// ����, �ĸ��� TimeZone��ü�� ������ setTimeZone�޼ҵ带 ȣ����.
		dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		String str2 = dateFormat.format(calendar.getTime());
		
		System.out.println("������ �ð� : " + str);
		System.out.println("ȫ���� �ð� : " + str1);
		System.out.println("�ĸ��� �ð� : " + str2);
	}

}
