package ex18_04;
//ObjectInputStream Ŭ������ �̿��Ͽ� ��ü�� ���Ϸκ��� �д� ��
//GregorianCalendar�� ����ȭ ������ Ŭ���� : java.io.Serializable �������̽��� �����ϴ� �κ�

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectInputExample1 {
	public static void main(String args[]) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output.dat"));
			// ���� ���ϴ�.
			// ObjectInputStream Ŭ������ ��Ʈ�� ���·� �о���� ��ü�� ���α׷����� ����� �� �ִ� ��ü�� �����
			// ����� Ŭ�����Դϴ�.
			// �� Ŭ������ fileInputStream Ŭ������ �Բ� ����ϸ� ���Ͽ� ����� ��ü�� ���α׷����� �ٽ� �о �����
			// �� �ֽ��ϴ�.
			// fileInputStream ��ü�� �����ؼ� ObjectInputStream ������ �Ķ���ͷ� �Ѱ���� �մϴ�.

			while (true) {

				// ��ü�� ������ȭ�ϴ� �κ�
				// readObject �޼ҵ� : �Էµ� ��Ʈ������ ���� ��ü�� ���� �����ϴ� �޼ҵ�. ����Ÿ��
				// (object)
				// ����Ÿ�� object�� ���� Ŭ���� Ÿ������ ����ϱ� ���� ĳ��Ʈ ������ �ؾ� �մϴ�.
				// readObject()�� Object���̹Ƿ� GregorianCalendarŸ������ ����ȯ�ؾ� �մϴ�.
				GregorianCalendar calendar = (GregorianCalendar) in.readObject();
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(calendar.MONTH) + 1;
				int date = calendar.get(calendar.DATE);
				System.out.println(year + "/" + month + "/" + date);
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");

		} catch (EOFException eofe) {// ���Ϸκ��� ���̻� ���� ��ü�� ������ �߻��ϴ� ����ó���� �մϴ�.
			System.out.println("�ø���.");

		} catch (IOException ioe) {
			System.out.println("������ ���� ���� �����ϴ�.");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�..");
			
		} finally {
			try {
				in.close(); // ���� ����

			} catch (Exception e) { // close�޼ҵ尡 �߻��ϴ� ����ó��
			}
		}
	}
}
