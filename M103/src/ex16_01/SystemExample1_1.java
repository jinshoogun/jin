package ex16_01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemExample1_1 {
	public static void main(String args[]){
		//System Ŭ������ in�ʵ带 ������ InputStreamReader ��ü�� �����Ѵ�.
		InputStreamReader reader = new InputStreamReader(System.in);
		
		//Ű����κ��� �ѱ�¥�� �Է¹޾Ƽ� ����ϴ� ���� ��ħǥ(,)�� �Էµɶ����� �ݺ��˴ϴ�.
		try{
			while (true) {
				char  ch = (char) reader.read(); //�ѱ��ھ� �Է¹���
				//int ch = reader.read();
				// �ƽ�Ű�ڵ�� ��� ����
//				���.
//				�Էµ� ���� : 49324
//				�Էµ� ���� : 46988
//				�Էµ� ���� : 46
//				�Էµ� ���� : 13 (����)
//				�Էµ� ���� : 10 (����)
				System.out.println("�Էµ� ���� : "  + ch);
				if (ch == ',')
					break;
			}
		}
		catch(IOException e) {
			System.out.println("Ű���� �Է� ����");
			
		}
	}
}




