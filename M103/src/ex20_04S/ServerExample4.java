package ex20_04S;

//서버 프로그램
import java.net.*;
class ServerExample4 {
    public static void main(String[] args) {
    	System.out.println("여기는 서버 입니다.~");
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9002);
            while (true) {
            	//연결 요청이 오면 소켓을 생성합니다.
                //accept 메소드 : 서버 소켓으로 연결 요청이 들어오면 연결을 맺고 클라이언트 소켓을 생성해서 리턴하는 메소드
                Socket socket = serverSocket.accept();
                
                //요청이 올 때마다 스레스 생성
                Thread thread = new  ReceiverThread(socket);
                thread.start();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


