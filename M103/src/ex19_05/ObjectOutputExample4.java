package ex19_05;

// Object�� java.io.Serializble �������̽��� �������� �ʱ� ������ ����ȭ ���� Ŭ������ �ƴմϴ�.
// writeObject �޼ҵ尡 IOExcept �߻��մϴ�.
// �ذ� ��� : �ʵ� ���� Ÿ�� ���� (Object - > String)

import java.io.*;

public class ObjectOutputExample4 {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output4.dat"));
		
			BBSItem obj = new BBSItem("�̼���", "moonlight", "�ڷ� �����Դϴ�.", "÷�������� �����Ͻʽÿ�");
			
			obj.addAttachment(new Object());
			//obj.addAttachment("��ī�ڹ� 500g 1550��");
			System.out.println("��ü�Խù� �� : " + obj.itemNum);
			System.out.println("�۾��� : " + obj.writer);
			System.out.println("�н����� : " + obj.passwd);
			System.out.println("���� : " + obj.title);
			System.out.println("���� : " + obj.content);
			System.out.println("÷�� : " + obj.addAttachment);
			out.writeObject(obj); //writeObject �޼ҵ尡 IOException �߻�
			// ����ȭ ��� �ʵ� �߿� �ϳ��� ����ȭ �� �� ���� Ÿ���� �ʵ尡 ������ ����ó���� �߻��ؼ� ��ü ��ü�� ����ȭ���� �ʰ� �˴ϴ�.

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
