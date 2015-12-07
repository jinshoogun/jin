package ex18_03;
//DataOutputStream Ŭ������ ��뿹
//DataOutputStream Ŭ������ �⺻�� �����͸� ����Ʈ ��Ʈ������ ����� ����ϴ� ����� Ŭ�����̴�.
//�� Ŭ������ ���Ͽ� �����͸� ���� ����� ���� �Ӷ����� FileOutPutStream�� �Բ� ����ؾ� �⺻�� �����͸� ���Ͽ� �� �� �ִ�.

import java.io.*;

public class DataInputExample1 {
	public static void main(String args[]) {
		DataInputStream in = null;
		try {
			in = new DataInputStream(new FileInputStream("output.dat"));// ���� ��.
			// public DataInputStream(InputStream in)
			
			// ���Ϸκ��� ������ �о ����մϴ�.
			while (true) {
				int data = in.readInt(); // �����͸� �дٰ� ���� ���� ������ EOFException
				System.out.println(data);
			}

		} catch (FileNotFoundException fnfe) { // readInt() �޼ҵ忡 ���� ������ ���� �����ϸ�  �̰����� �̵�
			System.out.println("������ �������� �ʽ��ϴ�.");

		} catch (EOFException eofe) {
			System.out.println("�ø���.");
			
		} catch (IOException ioe) {
			System.out.println("������ ���� ���� �����ϴ�.");

		} finally {
			try {
				in.close(); // ���� ����

			} catch (Exception e) { // close�޼ҵ尡 �߻��ϴ� ����ó��
			}
		}
	}
}
