package ex12_01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//��Ӱ��迡  �ִ� �������� Exception�� ó���ϴ� try
//catch�� ����ó�� ������ �ڽĿ��� �θ������ ����
// FileNotFoundException -> IOException

public class ExceptionExample9_1 {
	public static void main(String args[]) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		} catch (FileNotFoundException e) { // �ڽ� ����ó�� (������ �θ� ����ó���� �ٲٸ� �ȵ˴ϴ�.)
			System.err.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) { // �θ� ����ó�� (������ �ڽ� ����ó���� �ٲٸ� �ȵ˴ϴ�.)
			System.err.println("����� ������ �߻��Ͽ����ϴ�..");
		}
	}
}