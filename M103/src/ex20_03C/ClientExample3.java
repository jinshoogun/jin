package ex20_03C;
import java.net.*;

public class ClientExample3 {
    public static void main(String[] args) {
    	System.out.println("����� Ŭ���̾�Ʈ �Դϴ�.~");
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 9001);
            //�� ���� �����带 �����մϴ�.
            Thread thread1 = new SenderThread(socket);
            Thread thread2 = new ReceiverThread(socket);
            
            //�� ���� �����带 �����մϴ�.
            thread1.start();
            thread2.start();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}