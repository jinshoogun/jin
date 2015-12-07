package ex18_02;
//FileOutputStream Ŭ������ �̿��Ͽ� ����Ʈ �����͸� ���Ͽ� ���� ���α׷�
//Output.dat�� ��� Ȯ���غ��� - ���ϳ����� ���� �����Ͱ� �ƴϱ� ������ ������ Ȯ�� �� �� ����.
//write �޼ҵ�� �Ķ���͸� ����Ʈ �����ͷ� ����մϴ�.
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutPutStreamExample1 {
	public static void main(String args[]) {
		FileOutputStream out = null;
		try {
			
			out = new FileOutputStream("output.dat"); // ������ ���ϴ�.
			byte arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

			// ���Ͽ� �ݺ��ؼ� byteŸ�� �����͸� ���ϴ�.
			for (int cnt = 0; cnt < arr.length; cnt++)
				out.write(arr[cnt]);
			// �� �ι���� ���� �ǹ�
			// writer.write(arr);
		} catch (IOException ioe) {
			System.out.println("������ ����� �� �����ϴ�.");

		} finally {
			try {
				out.close(); // ������ �ݽ��ϴ�.
			} catch (Exception e) {

			}
		}
	}
}
