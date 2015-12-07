package ex20_03S;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class SenderThread extends Thread {
	   Socket socket;
	    SenderThread(Socket socket) {   
	        this.socket = socket;
	    }
	    public void run() {
	        try {
	            BufferedReader reader = new BufferedReader(
	                new InputStreamReader(System.in));
	            
	            PrintWriter writer = 
	                new PrintWriter(socket.getOutputStream());
	            
	            while (true) {
	            	//Ű����κ��� ���ڿ��� �Է¹޽��ϴ�.
	                String str = reader.readLine();
	                
	                //����ڰ� "bye"��� �Է��ϸ� �ݺ����� ���������ϴ�.
	                if (str.equals("bye"))
	                    break;
	                
	                //�Էµ� ���ڿ��� ������ �۽��մϴ�.
	                writer.println(str);
	                writer.flush();
	            }
	        }
	        catch (Exception e) {
	            System.out.println(e.getMessage());
	        }   
	        finally {
	            try {
	                socket.close();
	            }
	            catch (Exception ignored) {
	            }
	        }
	    }
	}