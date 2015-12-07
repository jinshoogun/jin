package ex20_04C;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class ReceiverThread extends Thread {
    Socket socket;
    ReceiverThread(Socket socket) {  
        this.socket = socket;
    }
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            
            while (true) {
               //������ ���� �޽����� �����մϴ�.
                String str = reader.readLine();
                if (str == null)
                    break;
                //���ŵ� �޽����� ����ͷ� ����մϴ�.
                System.out.println("����>" + str);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
