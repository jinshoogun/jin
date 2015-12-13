package ex20_02;

import java.net.*;
import java.io.*;

// ���� ���α׷�
public class ServerExample1 {
	public static void main(String args[]) {
		System.out.println("����� �����Դϴ�.");
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(9000); 
			socket = serverSocket.accept();

			// InputStreamReader Ŭ���� : ����Ʈ ��Ʈ���� ���� ��Ʈ������ �ٲپ��ִ� Ŭ����
			// �� Ŭ������ �����ڿ� �������κ��� ���� InputStream��ü�� �Ѱ��ָ� ��Ʈ��ũ�� ���ŵ� �����͸� ���� ��Ʈ�� ���·� ���� �� �ִ� InputStreamReader��ü�� �����˴ϴ�.
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//PrintWriter Ŭ������ �̿��Ͽ� ���� ��Ʈ���� ����Ʈ ��Ʈ������ �ٲپ ����ϱ� ���ؼ� �� Ŭ������ �����ڿ� OutputStreamŸ���� ��ü�� �Ķ���ͷ� �Ѱ���� �մϴ�.
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			//�����͸� �����մϴ�.
			String str = reader.readLine();
 
			System.out.println(new String(str)); // ���ŵ� �����͸� ����մϴ�.
			
			writer.println("Hello, Client!");
			//PrintWriter Ŭ������ println �޼ҵ�� ���ڿ��� ����ϸ� �� ���ڿ��� �޼ҵ� ȣ�� ��� ��Ʈ��ũ�� �۽ŵǴ� ���� �ƴ϶� ���۰� �� �� ������ ������ٰ�
			// �Ѳ����� �۽��մϴ� �׷���  println �޼ҵ带 ȣ���� ������ �ٷ� ���ڿ��� �۽ŵǵ��� �Ϸ��� flush �޼ҵ带 ȣ���ؾ� �մϴ�.
			writer.flush();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch (Exception ignored) {

			}
			try {
				serverSocket.close();
			} catch (Exception ignored) {

			}
		}
	}
}
