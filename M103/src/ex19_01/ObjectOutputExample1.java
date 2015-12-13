package ex19_01;

// ObjectOutputStream Ŭ������ �̿��Ͽ� ��ü�� ���Ͽ� �����ϴ� ��
import java.io.*;
import java.util.GregorianCalendar;

public class ObjectOutputExample1 {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			// ������ ���ϴ�.
			// ObjectOutputStream Ŭ������ ��ü�� ��Ʈ������ ���� ����ϴ� ����� �ִ� Ŭ����
			// ��Ŭ�������� �����͸� ���Ϸ� �����ϴ� ����� ���� ������ fileOutputStream Ŭ������ �Բ� �̿��ؾ� �Ѵ�.
			// fileOutputStream ��ü�� �����ؼ� ObjectOutputStreamŬ������ ������ �Ķ���ͷ� �Ѱ��־��
			// �Ѵ�.

			out = new ObjectOutputStream(new FileOutputStream("output.dat"));
			// ��ü�� ����ȭ�ϴ� �κ�
			// writeObject �޼ҵ� : �ĸ����ͷ� �Ѱ��� ��ü�� ��Ʈ������ ���� ����ϴ� �޼ҵ�
			// �Ķ���ͷ� �Ѱ��� ��ü�� ���Ͽ� �����մϴ�.
			// GregorianCalendar��ü�� �����ؼ� ���Ͽ� ���ϴ�.
			out.writeObject(new GregorianCalendar(2006, 0, 14));
			out.writeObject(new GregorianCalendar(2006, 0, 15));
			out.writeObject(new GregorianCalendar(2006, 0, 16));

		} catch (IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		} finally {
			try {
				out.close();

			} catch (Exception e) {//���� ����

			}
		}
	}
}
