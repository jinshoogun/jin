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
	            
	            //Ŭ���̾�Ʈ�κ��� �޽����� �����ؼ� ����ͷ� ����ؾ� �մϴ�.
	            while (true) {
	                String str = reader.readLine();
	                if (str == null)
	                    break;
	                System.out.println("����>" + str);
	            }
	        }
	        catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}

