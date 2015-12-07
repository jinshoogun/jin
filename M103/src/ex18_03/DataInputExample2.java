package ex18_03;
//DataOutputStream Ŭ������  ��뿹 - ���ڿ� ����
//String Ÿ���� �����͸� ���� �޼ҵ� : writeUTF()
//String Ÿ�� ���� �ٸ� ��ü�� ���� ����� ����.
//�ٸ� Ÿ���� ��ü�� ������ ObjectOutPutStream Ŭ������ ����ؾ� �Ѵ�.

import java.io.*;

public class DataInputExample2 {
	public static void main(String args[]) {
		DataInputStream in = null;
		try {
			in = new DataInputStream(new FileInputStream("output.dat"));// ���� ��.
	
			String data = in.readUTF(); 
				System.out.println(data);
			
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
