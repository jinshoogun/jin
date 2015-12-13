package ex18_08;

import java.io.*;
import java.util.GregorianCalendar;

//���� ���丮�� ������丮�� ���� ����� ����ϴ� ���α׷�
// File Ŭ���� : ���� ��������� ���� Ŭ���� (���� ������ɵ� ���� ����)
//%-25s : 25ĭ�� �������� ����
//%1$tF : YYYY-mm-dd ������ ��¥
//%1$tT : HH:MM:SS ����

public class FileExample1 {
	public static void main(String args[]){
		File file = new File(".");// ���� ���� ��θ��� ������  File ��ü�� ����
		File arr[] = file.listFiles(); // ���������� ���� ����� ������
		
		for (int cnt = 0; cnt < arr.length; cnt++){
			String name = arr[cnt].getName(); //�̸� ����
			if (arr[cnt].isFile()) // �����̸� true �ƴϸ� false
				System.out.printf("%-25s %7d \t", name, arr[cnt].length());
			    // arr[cnt].length() ������ ũ�� ���ϱ�
			
			else 
				System.out.printf("%-25s <DIR> \t", name);
			
			long time = arr[cnt].lastModified(); //���� �����Ͻø� ����
			
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTimeInMillis(time); //1970�� 1�� 1�� 0�� 0�� 0�� �������� �и������� ���� ���Ѵ�.
			System.out.printf ("%1$tF %1$tT \n", calendar);
		}
	}

}
