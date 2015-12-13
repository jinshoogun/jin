package ex19_04;

// BBSItem ��ü�� ����ȭ�ϴ� ���α׷�
import java.io.*;

public class ObjectOutputExample3 {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output3.dat"));
		
			BBSItem obj = new BBSItem("�ּ���", "sunshine", "�����սô�.", "�̹��� �ָ� �����?");
			
			System.out.println("��ü�Խù� �� : " + obj.itemNum);
			System.out.println("�۾��� : " + obj.writer);
			System.out.println("�н����� : " + obj.passwd);
			System.out.println("���� : " + obj.title);
			System.out.println("���� : " + obj.content);
			out.writeObject(obj); //��ü�� ����ȭ�ϴ� �κ�

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
