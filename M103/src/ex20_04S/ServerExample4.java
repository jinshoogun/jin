package ex20_04S;

//���� ���α׷�
import java.net.*;
class ServerExample4 {
    public static void main(String[] args) {
    	System.out.println("����� ���� �Դϴ�.~");
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9002);
            while (true) {
            	//���� ��û�� ���� ������ �����մϴ�.
                //accept �޼ҵ� : ���� �������� ���� ��û�� ������ ������ �ΰ� Ŭ���̾�Ʈ ������ �����ؼ� �����ϴ� �޼ҵ�
                Socket socket = serverSocket.accept();
                
                //��û�� �� ������ ������ ����
                Thread thread = new  ReceiverThread(socket);
                thread.start();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


