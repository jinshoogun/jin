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
               //서버로 부터 메시지를 수신합니다.
                String str = reader.readLine();
                if (str == null)
                    break;
                //수신된 메시지를 모니터로 출력합니다.
                System.out.println("수신>" + str);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
