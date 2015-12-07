package ex20_03S;
import java.net.*;

class ServerExample3 {
    public static void main(String[] args) {
    	System.out.println("여기는 서버 입니다.~");
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(9001);
            socket = serverSocket.accept();
            
            //두 스레드를 생성합니다.
            Thread thread1 = new SenderThread(socket);
            Thread thread2 = new ReceiverThread(socket);
            
            //두 스레드를 시작합니다.
            thread1.start();
            thread2.start();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                serverSocket.close();
            }
            catch (Exception ignored) {
            }
        }   
    }
}