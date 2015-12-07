package ex18_01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//�Ѳ����� �������ڸ� �д� Read �޼ҵ� ��
public class ReaderExample4 {
	public static void main(String args[]) {
		FileReader reader = null;
		char arr[] = new char [64];
		try {
			reader = new FileReader ("poem.txt");
			reader.read(arr); //���Ͽ� �ִ� ���ڸ� ���� char �迭
			
			System.out.println(String.valueOf(arr).trim()); //trim() : �������� 
			//public static String valueof(char[] date)
		
		} catch (FileNotFoundException fnfe) { 
			System.out.println("������ �������� �ʽ��ϴ�.");
			
		} catch (IOException ioe) { // Exception - IOException
			System.out.println("������ ���� ���� �����ϴ�.");
			
		} catch (NullPointerException n ) { 
			// Exception - RuntimeException - NullPointerException ����ó���Ҷ� �ۼ��ؾ� �� ����!
			System.out.println("NullPointerException ���� �߻�");	

		} finally { // ������ �ݴ� ��ɹ��� ������ ������� ó���ϱ� ���ؼ� finally ��Ͽ� �����.
			try{
				reader.close();
	
			} catch(Exception e){ //close�޼ҵ尡 �߻��ϴ� ����ó��
				// IOException�� NullPointerExceptionó���ϱ� ���� 
			}
		}
	}
}
