package ex13_06;
//equals �޼ҵ� ��� �� - �Ȱ��� ���� ���� �ΰ��� ��ü ����
import java.util.GregorianCalendar;

public class ObjectExample5 {
	public static void main(String args[]){
		GregorianCalendar obj1 = new GregorianCalendar(2007, 0, 1);
		GregorianCalendar obj2 = new GregorianCalendar(2007, 0, 1);
		
		if (obj1.equals(obj2))
			System.out.println("���� ����");
		else
			System.out.println("���� �ٸ�");
		
		if (obj1 == obj2)
			System.out.println("�� ��ü�� �ּҰ��� ����.");
		else
			System.out.println("�� ��ü�� �ּҰ��� �ٸ�");
	}
}
