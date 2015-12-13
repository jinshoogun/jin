package ex20_02;

import java.net.*;
import java.io.*;

// 서버 프로그램
public class ServerExample1 {
	public static void main(String args[]) {
		System.out.println("여기는 서버입니다.");
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(9000); 
			socket = serverSocket.accept();

			// InputStreamReader 클래스 : 바이트 스트림을 문자 스트림으로 바꾸어주는 클래스
			// 이 클래스의 생성자에 소켓으로부터 얻은 InputStream객체를 넘겨주면 네트워크로 수신된 데이터를 문자 스트림 형태로 읽을 수 있는 InputStreamReader객체가 생성됩니다.
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//PrintWriter 클래스를 이용하여 문자 스트림을 바이트 스트림으로 바꾸어서 출력하기 위해서 이 클래스의 생성자에 OutputStream타입의 객체를 파라미터로 넘겨줘야 합니다.
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			//데이터를 수신합니다.
			String str = reader.readLine();
 
			System.out.println(new String(str)); // 수신된 데이터를 출력합니다.
			
			writer.println("Hello, Client!");
			//PrintWriter 클래스의 println 메소드로 문자열을 출력하면 그 문자열이 메소드 호출 즉시 네트워크로 송신되는 것이 아니라 버퍼가 다 찰 때까지 모아졌다가
			// 한꺼번에 송신합니다 그래서  println 메소드를 호출한 다음에 바로 문자열에 송신되도록 하려면 flush 메소드를 호출해야 합니다.
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
