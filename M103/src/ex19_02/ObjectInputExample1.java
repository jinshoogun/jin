package ex19_02;
//GoodsStock ��ü�� ������ȭ�ϴ� ���α׷� 
// ����ȭ�� ���� - java.io.Serialable �������̽��� �������� �ʾұ� �����Դϴ�.
import java.io.*;

public class ObjectInputExample1  {
	public static void main(String args[]) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output2.dat"));
		
			while (true) {

				GoodsStock obj = (GoodsStock) in.readObject();
				System.out.println("��ǰ �ڵ� : " + obj.code + "\t ��ǰ ���� : " + obj.num);
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
