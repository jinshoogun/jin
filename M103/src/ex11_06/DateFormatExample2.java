package ex11_06;


// SimpleDateFormat Ŭ������ ����Ͽ� ��¥�� �ð��� �����ϴ� ���α׷�
// SimpleDateFormat Ŭ������ format() �޼ҵ��� �Ű������� Date�� �ʿ�
// Calendar�� getTime() �޼ҵ带 �̿��Ͽ� Date�� ���ϰ��� ����.
// Calendar-> Date��
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

class DateFormatExample2 {
	public static void main(String args[]) {
		GregorianCalendar calendar = new GregorianCalendar();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� aa HH�� mm�� ss��");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy�� M�� d�� a h�� m�� s��");
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("yyyy�� M�� d�� E a h�� m�� s��");
		
		String str = dateFormat.format(calendar.getTime());
		//calendar.getTime()�� �������� Date��
		System.out.println(str);
		
		String str2 = dateFormat2.format(calendar.getTime());
		System.out.println(str2);
		
		String str3 = dateFormat3.format(calendar.getTime());
		System.out.println(str3);
		
		Date changeDate = calendar.getTime();
		System.out.println(changeDate);

	}

}
