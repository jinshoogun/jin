package ex20_01_1;

import java.io.*;
import java.net.*;

public class ClientExample1 {
	public static void main(String args[]){
		System.out.println("Ping Test");
		Socket socket = null;
		try {
			// �����ڸ� ȣ���ϸ� �� ������ �ȿ��� ���� ���α׷����� ���� ��û�� ���۵ǰ� �� ��� Ŭ���̾�Ʈ ���α׷��� ���� ���α׷��� ������ �ξ����� �˴ϴ�.
			socket = new Socket("127.0.0.1", 9000); //���� ����
			
			//������ ���ſ� ����� �Է� ��Ʈ�� ��ü�� �����ϴ� �޼ҵ�
			InputStream in = socket.getInputStream();
			
			//������ �۽ſ� ����� ��� ��Ʈ�� ��ü�� �����ϴ� �޼ҵ�
			OutputStream out = socket.getOutputStream();
			
			String str = "received.";
			out.write(str.getBytes());
			//getBytes �޼ҵ�� ���ڿ��� ����Ʈ �迭�� ����� �޼ҵ� �Դϴ�. �Ķ���ͷ� �Ѱ��� �����͸� �۽��մϴ�.
			
			byte arr[] = new byte[100];
			in.read(arr); //�����͸� �����մϴ�.
			
			System.out.println(new String(arr)); // ���ŵ� �����͸� ����մϴ�.
			
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
