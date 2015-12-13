package ex20_02;

import java.io.*;
import java.net.*;

public class ClientExample1 {
	public static void main(String args[]){
		System.out.println("����� Ŭ���̾�Ʈ�Դϴ�.");
		Socket socket = null;
		try {
			socket = new Socket("127.0.0.1", 9000); //���� ����
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			//�����͸� �۽��մϴ�.
			//PrintWriter Ŭ������ println �޼ҵ�� ���ڿ��� ����ϸ� �� ���ڿ��� �޼ҵ� ȣ�� ��� ��Ʈ��ũ�� �۽ŵǴ� ���� �ƴ϶� ���۰� �� �� ������ ������ٰ�
			// �Ѳ����� �۽��մϴ� �׷���  println �޼ҵ带 ȣ���� ������ �ٷ� ���ڿ��� �۽ŵǵ��� �Ϸ��� flush �޼ҵ带 ȣ���ؾ� �մϴ�.
			writer.println("Hello, Server!");
			writer.flush();
			
			//�����͸� �����մϴ�.
			String str = reader.readLine();
			
			// ���ŵ� �����͸� ����մϴ�.
			System.out.println(str);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch (Exception e){
				
			}
		}
	}
}
