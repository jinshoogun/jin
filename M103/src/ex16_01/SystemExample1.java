package ex16_01;
// Ű����κ��� ���ڸ� �Է¹޴� ���α׷�
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemExample1 {
	public static void main(String args[]){
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			String str = reader.readLine();// Ű����κ��� �� ���� �Է¹���
			System.out.println("�Էµ� ���ڿ� : " + str);
			
		}catch(IOException e) {
			System.out.println("Ű���� �Է� ����");
		}
	}
}




