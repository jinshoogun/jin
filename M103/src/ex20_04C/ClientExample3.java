package ex20_04C;
import java.net.*;

class ClientExample3 {
    public static void main(String[] args) {
    	System.out.println("여기는 클라이언트 입니다.~");
        Socket socket = null;
        try {
            socket = new Socket("192.168.30.204", 9002);
            //두 개의 스레드를 생성합니다.
            Thread thread1 = new SenderThread(socket);
            Thread thread2 = new ReceiverThread(socket);
            
            //두 개의 스레드를 시작합니다.
            thread1.start();
            thread2.start();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}