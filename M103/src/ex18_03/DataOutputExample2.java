package ex18_03;
//DataOutputStream Ŭ������  ��뿹 - ���ڿ� ����
// String Ÿ���� �����͸� ���� �޼ҵ� : writeUTF()
//String Ÿ�� ���� �ٸ� ��ü�� ���� ����� ����.
//�ٸ� Ÿ���� ��ü�� ������ ObjectOutPutStream Ŭ������ ����ؾ� �Ѵ�.

import java.io.*;

public class DataOutputExample2 {
	public static void main(String args[]) {
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(new FileOutputStream("output.dat"));// ���� ����.


			out.writeUTF("��ſ� �������Դϴ�.");


		} catch (IOException ioe) { // Exception - IOException
			System.out.println("������ ����� ���� �����ϴ�.");

		} finally { // ������ �ݴ� ��ɹ��� ������ ������� ó���ϱ� ���ؼ� finally ��Ͽ� �����.
			try {
				out.close(); // ���� ����

			} catch (Exception e) { // close�޼ҵ尡 �߻��ϴ� ����ó��
				// IOException�� NullPointerExceptionó���ϱ� ����
			}
		}
	}
}
