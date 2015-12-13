package ex20_03S;
import java.net.*;

class ServerExample3 {
    public static void main(String[] args) {
    	System.out.println("����� ���� �Դϴ�.~");
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(9001);
            socket = serverSocket.accept();
            
            //�� �����带 �����մϴ�.
            Thread thread1 = new SenderThread(socket);
            Thread thread2 = new ReceiverThread(socket);
            
            //�� �����带 �����մϴ�.
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