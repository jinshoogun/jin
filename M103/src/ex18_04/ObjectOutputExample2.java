package ex18_04;

// StringTokenizer : ��ü ����ȭ �Ұ����� Ŭ����
import java.io.*;
import java.util.*;

public class ObjectOutputExample2 {
	public static void main(String args[]) {
		System.out.println("****���α׷� ���� *****");
		ObjectOutputStream out = null;
		try {
			FileOutputStream Fileout = new FileOutputStream("output.dat");
			out = new ObjectOutputStream(Fileout);
			System.out.println("������ �������ϴ�.");
			
			// ���Ϸ� ��ü�� ����Ͽ����ϴ�.
		
			out.writeObject(new StringTokenizer("| |", "|"));
			System.out.println("���Ϸ� StringTokenizer ��ü�� ����մϴ�.");

		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");

		} catch (IOException ioe) {
			System.out.println("������ ���� ���� �����ϴ�.");
			
		} finally {
			try {
				out.close(); // ���� ����
				System.out.println("������ �ݾҽ��ϴ�.");
			} catch (Exception e) { // close�޼ҵ尡 �߻��ϴ� ����ó��
			}
		}
	}
}
