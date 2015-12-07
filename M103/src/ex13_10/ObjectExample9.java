package ex13_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectExample9 {
	public static void main(String args[]) {
		Rectangle obj = new Rectangle(10, 20);
		Class cls = obj.getClass(); // ��ü�� ���ϴ� Ŭ������ ������ �����մϴ�.
		String name = cls.getName();
		System.out.println("Ŭ���� �̸� : " + name);

		Class superCls = cls.getSuperclass(); // ����Ŭ������ ������ �����ϴ� �޼ҿ�������
		String superName = superCls.getName(); // ����Ŭ������ �̸��� �����ϴ� �޼ҿ�������
		System.out.println("����Ŭ���� �̸� : " + superName);

		// Ŭ������ ����Ǿ� �ִ� ������ �������� �޼ҿ�����
		Field field[] = cls.getDeclaredFields();
		System.out.println("�ʵ� : ");
		for (int cnt = 0; cnt < field.length; cnt++)
			System.out.println("   " + field[cnt]);

		// Ŭ������ ����Ǿ� �ִ� �޼ҵ� ������ �������� �޼ҵ�
		Method method[] = cls.getDeclaredMethods();
		System.out.println("�޼��� : ");
		for (int cnt = 0; cnt < method.length; cnt++)
			System.out.println("   " + method[cnt]);
	}
}
