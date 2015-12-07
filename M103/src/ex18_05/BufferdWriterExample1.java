package ex18_05;

import java.io.*;

public class BufferdWriterExample1 {
	public static void main(String args[]) {
		BufferedWriter writer = null;
		try {

			writer = new BufferedWriter(new FileWriter("output.txt"));

			char arr[] = { '��', '��', '��', ' ', '��', ' ', '��', '��', ' ', '��', '��', ' ', '��', '��', ' ', '��' };

			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);

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
