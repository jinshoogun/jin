package ex18_03;
//DataOutputStream Ŭ������ ��뿹

//DataOutputStream Ŭ������ �⺻�� �����͸� ����Ʈ ��Ʈ������ ����� ����ϴ� ����� Ŭ�����̴�.
//�� Ŭ������ ���Ͽ� �����͸� ���� ����� ���� �Ӷ����� FileOutPutStream�� �Բ� ����ؾ� �⺻�� �����͸� ���Ͽ� �� �� �ִ�.

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputExample1 {
	public static void main(String args[]) {
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(new FileOutputStream("output.dat"));// ����
																			// ����.
			// java.io.DataOutputStream.DataOutputStream(OutputStream arg0)

			int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			for (int cnt = 0; cnt < arr.length; cnt++)
				out.writeInt(arr[cnt]); // ���Ͽ� int Ÿ�������͸� ���ϴ�.

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
