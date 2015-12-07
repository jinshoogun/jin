package ex18_02;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample1 {
	public static void main(String args[]) {
		FileWriter writer = null;
		try {
			// FileWriter ������ �ȿ� ������ ���� ����� �ֽ��ϴ�.
			writer = new FileWriter("output.txt"); // ������ ���ϴ�.
			// public FileWriter(String fileName) throws IOException
			// FileWriter �����ڴ� IOException������ �߻��ϱ� ������ IOException ó��

			char arr[] = { '��', '��', '��', ' ', '��', ' ', '��', '��', ' ', '��', '��', ' ', '��' };

			// ���Ͽ� �ݺ��ؼ� ���ڵ��� ���ϴ�.
			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
			// �� �ι���� ���� �ǹ�
			// writer.write(arr);
		} catch (IOException ioe) {
			System.out.println("������ ����� �� �����ϴ�.");

		} finally {
			try {
				writer.close(); // ������ �ݽ��ϴ�.
			} catch (Exception e) {

			}
		}
	}
}
