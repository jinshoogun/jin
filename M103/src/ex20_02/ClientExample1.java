package ex20_02;

import java.io.*;
import java.net.*;

public class ClientExample1 {
	public static void main(String args[]){
		System.out.println("여기는 클라이언트입니다.");
		Socket socket = null;
		try {
			socket = new Socket("127.0.0.1", 9000); //소켓 생성
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			//데이터를 송신합니다.
			//PrintWriter 클래스의 println 메소드로 문자열을 출력하면 그 문자열이 메소드 호출 즉시 네트워크로 송신되는 것이 아니라 버퍼가 다 찰 때까지 모아졌다가
			// 한꺼번에 송신합니다 그래서  println 메소드를 호출한 다음에 바로 문자열에 송신되도록 하려면 flush 메소드를 호출해야 합니다.
			writer.println("Hello, Server!");
			writer.flush();
			
			//데이터를 수신합니다.
			String str = reader.readLine();
			
			// 수신된 데이터를 출력합니다.
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
