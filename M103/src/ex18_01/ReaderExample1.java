package ex18_01;

import java.io.FileReader;

// �ؽ�Ʈ ������ �д� ���α׷� - ���� �߻�
// �ذ�� - try - catch���̳�  throws Exception�� ó��
public class ReaderExample1 {
	public static void main (String args[]){
		FileReader reader = new FileReader("poem.txt");
		//C:\workspace\������Ʈ��\poem.txt (����θ� ����� �����̴�.)
		// ���� ��� C:\\workspace\\������Ʈ��\\poem.txt (����� \ �ϳ� ���)
		// FileReader reader = new FileReader("F:\\T110E5\\M103\\poem.txt"); (������ \\�ΰ� ���� ����!)
		//������ �о ó���ϴ� �κ�
		while(true) {
			//���Ͽ� �ִ� ���� �ϳ��� �о �����ϴ� �޼ҵ�
			int data = reader.read();
			
			if (data ==-1) //���̻� ���� �����Ͱ� ���� ���
				break;
			
			char ch =  (char) data;
			System.out.println(ch);
		}
		reader.close(); //������ �ݴ´�.
		
	}

}
