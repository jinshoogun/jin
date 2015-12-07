package ex19_02;

// GoodsStock ��ü�� ����ȭ�ϴ� ���α׷�
import java.io.*;

public class ObjectOutputExample2 {
	public static void main(String args[]) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("output2.dat"));
			out.writeObject(new GoodsStock("70101", 100));
			out.writeObject(new GoodsStock("70102", 50));
			out.writeObject(new GoodsStock("70103", 200));

		} catch (IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
			
		} finally {
			try {
				out.close();

			} catch (Exception e) {
			}
		}
	}
}
