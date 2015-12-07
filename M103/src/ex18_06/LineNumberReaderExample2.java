package ex18_06;
// �ؽ�Ʈ�� ���࿡ ��ȣ�� �ű�鼭 �д� Ŭ����
//LineNumberWriter�� ����

import java.io.*;

public class LineNumberReaderExample2 {
	public static void main(String args[]) {
		LineNumberReader reader = null;
		try {
			reader = new LineNumberReader(new FileReader("poem.txt"));
			// ���Ϸκ��� ���྿ �о ���ȣ�� �Բ� ����մϴ�.

			while (true) {
				String str = reader.readLine(); //���Ϸκ��� ���྿ ����
				if (str == null) // ���̻� ���� �����Ͱ� ���� ���
					break;
				
				int lineno = reader.getLineNumber();
				System.out.println(lineno + ": " + str);
			}
		} catch (FileNotFoundException fnfe) { 
			System.out.println("������ �������� �ʽ��ϴ�.");
			
		} catch (IOException ioe) { 
			System.out.println("������ ���� ���� �����ϴ�.");

		} finally { 
			try{
				reader.close();
	
			} catch(Exception e){ 
			}
		}
	}
}
