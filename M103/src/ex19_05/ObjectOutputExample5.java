package ex19_05;

// Object�� java.io.Serializble �������̽��� �������� �ʱ� ������ ����ȭ ���� Ŭ������ �ƴմϴ�.
// writeObject �޼ҵ尡 IOExcept �߻��մϴ�.
// �ذ� ��� : �ʵ� ���� Ÿ�� ���� (Object - > String)

import java.io.*;

public class ObjectOutputExample5 {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output4.dat"));
		
			BBSItem obj = new BBSItem("�̼���", "moonlight", "�ڷ� �����Դϴ�.", "÷�������� �����Ͻʽÿ�");
			//addAttachment �޼ҵ��� �Ķ���ͷ� �Ѱ��� ���ڿ��� attachment �ʵ忡 ���ԵǴ� �� ���ڿ��� Ÿ���� String Ŭ������ ����ȭ
			//������ Ŭ�����̱� �����Դϴ�. 
			
			obj.addAttachment("��ī�ڹ� 500g 1550��");
			System.out.println("��ü�Խù� �� : " + obj.itemNum);
			System.out.println("�۾��� : " + obj.writer);
			System.out.println("�н����� : " + obj.passwd);
			System.out.println("���� : " + obj.title);
			System.out.println("���� : " + obj.content);
			System.out.println("÷�� : " + obj.addAttachment);
			out.writeObject(obj); //IOException ������ �߻����� ����

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
