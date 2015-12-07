package ex18_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// ������ ������ �о 16������ ����ϴ� ���α׷�
public class FileDump {
	public static void main(String args[]){
		if (args.length < 1) {
			System.out.println("���ϸ��� Arguments �ǿ� output.txt �Է����ּ���. ");
			return;
		}
		
		FileInputStream in = null;
		try{
			in = new FileInputStream(args[0]); //������ ���ϴ�
			//Run -> Run Configuration���� �Ű����� ������ output.dat �Է�
			
			byte arr[] = new byte[16];
			while (true) {
				int num = in.read(arr); //���Ϸκ��� 16����Ʈ�� �н��ϴ�.
				if (num < 0)
					break;
				//�о���� ����Ʈ �����͸� 16������ ����մϴ�.
				
				for (int cnt = 0; cnt < num; cnt++)
					System.out.printf("%02X", arr[cnt]);
				//%02X 2�ڸ� 16���� (%x)�� ����ϵ�, �빮�� X�� ����ϸ鼭 ���ڰ� ���ڸ��̸� ���ڸ��� 0���� ä�� ��
				 System.out.println();
			}
		} catch (FileNotFoundException fnfe) { 
			System.out.println(args[0] + "������ �������� �ʽ��ϴ�.");
			
		} catch (IOException ioe) { // Exception - IOException
			System.out.println(args[0] + "������ ���� ���� �����ϴ�.");
			
		} finally { // ������ �ݴ� ��ɹ��� ������ ������� ó���ϱ� ���ؼ� finally ��Ͽ� �����.
			try{
				in.close(); // ���� ����
	
			} catch(Exception e){ //close�޼ҵ尡 �߻��ϴ� ����ó��
				// IOException�� NullPointerExceptionó���ϱ� ���� 
			}
		}
	}
}