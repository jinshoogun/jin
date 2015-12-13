package ex19_05;

import java.io.*;

public class ObjectInputExample4 {
	public static void main(String args[]) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output3.dat"));

			while (true) {
				BBSItem obj = (BBSItem) in.readObject(); //��ü�� ������ȭ�ϴ� �κ�
				System.out.println("��ü�Խù� �� : " + obj.itemNum); // �Խù��� �� - �����ʵ�� ����ȭ ����� �ƴ�
				System.out.println("�۾��� : " + obj.writer);
				System.out.println("�н����� : " + obj.passwd); //transient �ν��Ͻ� �ʵ�� ����ȭ ����� �ƴմϴ�.
				System.out.println("���� : " + obj.title);
				System.out.println("���� : " + obj.content);
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
