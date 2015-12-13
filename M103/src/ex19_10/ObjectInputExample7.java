package ex19_10;
// Rectangle ��ü�� ������ȭ�ϴ� ���α׷�
import java.io.*;

public class ObjectInputExample7 {
	public static void main(String args[]) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output7.dat"));

			while (true) {
				Rectangle obj = (Rectangle) in.readObject();
				System.out.println("���� : " + obj.width);
				System.out.println("���� : " + obj.height);
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");

		} catch (EOFException eofe) {// ���Ϸκ��� ���̻� ���� ��ü�� ������ �߻��ϴ� ����ó���� �մϴ�.
			System.out.println("�ø���.");

		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());

		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
			
		} finally {
			try {
				in.close(); // ���� ����

			} catch (Exception e) { // close�޼ҵ尡 �߻��ϴ� ����ó��
			}
		}
	}
}
