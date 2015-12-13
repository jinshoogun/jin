package ex18_01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//�ؽ�Ʈ ������ �д� ���α׷� - ���� �߻�
// �ذ�� - try - catch���̳�  throws Exception�� ó��
public class ReaderExample2 {
	public static void main(String args[]) {
		try {
			// fileReader Ŭ���� �ȿ��� �ؽ�Ʈ ���� (����� ���� �� �ִ� ���ڷθ� ������ ����)�κ���
			// �����͸� �б� ���ؼ��� ������ ����, �����͸� �а�, ������ �ݴ� ������ �۾��� �ʿ��� ��ɵ��� ��� ����ֽ��ϴ�.
			// fileReader �����ڸ� ���ؼ� ������ ���ϴ�.
			// FileReader �����ڴ� FileNotFoundException �߻� ����ó�����־�� �մϴ�
			// java.io.FileReader.FileReader (String filename) throws Exception

			FileReader reader = new FileReader("poem.txt");
			// C:\workspace\������Ʈ��\poem.txt (����θ� ����� �����̴�.)
			// ���� ��� C:\\workspace\\������Ʈ��\\poem.txt (����� \ �ϳ� ���)
			// FileReader reader = new FileReader("F:\\T110E5\\M103\\poem.txt");
			// (������ \\�ΰ� ���� ����!)
			// ���� '\'�� �ٸ� ���ڿ� �������� Ư���� ����� �����ϴ� ���ڷ� �ڱ��ڽ��� ��Ÿ������ �� ���� ����Ѵ�.
			// �ϳ��� ����ϸ� ������ �߻��Ѵ�.
			// \n'�� �ΰ��� ���ڷ� �̷���������� �ϳ��� ���ڷ� ��޵ȴ�.
			// '\n'�� Ŀ���� ���� �� �� ������ �Ű��ִ� ������ �ϴ� �����̰�, �̿� ���� ���ڵ��� Escape���ڶ�� �Ѵ�.

			// === Escope ���� ===
			// \n - ���๮��
			// \t - ��Ű�� ���� �� ó�� ����ĭ�� ���
			// \ - '\'�� ��Ÿ����.
			// \" - ū����ǥ(")�� ��Ÿ����.

			while (true) {
				// int java.io.
				int data = reader.read();
				if (data == -1) // ���̻� ���� �����Ͱ� ���� ���
					break;
				
				char ch = (char) data;
				System.out.print(ch);
			}
			// void java.io.InputStreamReader.close() throws IOException
			// IOExceptin �߻� - ����ó���� ����� �Ѵ�.
			reader.close(); // ���� �߻��� ������ �����ִ� ä�� ���α׷��� ������. ������
		} catch (FileNotFoundException fnfe) { // �а��� �ϴ� ������ ������ �߻��ϴ� ����ó��
			// FileReader �����ڰ� �߻��ϴ� ����ó��
			System.out.println("������ �������� �ʽ��ϴ�.");
			
		} catch (IOException ioe) { // ����¿� ���� �Ϲ����� ����(ex �ϵ��ũ�� ����)
			// FileReader�� read,close �޼ҵ尡 �߻��ϴ� ����ó��
			System.out.println("������ ���� ���� �����ϴ�.");

		}
	}
}
