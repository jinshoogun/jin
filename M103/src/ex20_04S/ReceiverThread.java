package ex20_04S;

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
	            
	            //클라이언트로부터 메시지를 수신해서 모니터로 출력해야 합니다.
	            while (true) {
	                String str = reader.readLine();
	                if (str == null)
	                    break;
	                System.out.println("수신>" + str);
	            }
	        }
	        catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}

