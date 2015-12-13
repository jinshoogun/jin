package ex18_02;
// 파일의 내용을 읽어서 16진수로 출력하는 프로그램
//FileInputStream은 파일로부터 문자가 아니라 바이트 단위로 데이터를 읽어서 리턴한다.
import java.io.*;

public class FileInPutStreamExample1 {
	public static void main(String args[]){
		if (args.length < 1) {
			System.out.println("파일명을 Arguments탭에 output.dat 입력해주세요. ");
			return;
		}
		
		FileInputStream in = null;
		try{
			in = new FileInputStream(args[0]); //파일을 엽니다
			//Run -> Run Configuration에서 매개변수 값으로 output.dat 입력
			
			byte arr[] = new byte[16];
			while (true) {
				int num = in.read(arr); //파일로부터 16바이트를 읽습니다.
				if (num < 0)// 읽어온 데이터가 -1이면 반복을 중단
					break;
				//읽어들인 바이트 데이터를 16진수로 출력합니다.
				
				for (int cnt = 0; cnt < num; cnt++)
					System.out.printf("%02X ", arr[cnt]);
				//%02X 2자리 16진수 (%X)로 출력하되, 대문자 X로 출력하면서 숫자가 한자리이면 앞자리를 0으로 채울 것
				//%02X 2자리 16진수 (%x)로 출력하되, 소문자 x로 출력하면서 숫자가 한자리이면 앞자리를 0으로 채울 것
				 System.out.println();
			}
		} catch (FileNotFoundException fnfe) { 
			System.out.println(args[0] + "파일이 존재하지 않습니다.");
			
		} catch (IOException ioe) { // Exception - IOException
			System.out.println(args[0] + "파일을 읽을 수가 없습니다.");
			
		} finally { // 파일을 닫는 명령문을 에러와 상관없이 처리하기 위해서 finally 블록에 사용함.
			try{
				in.close(); // 파일 종료
	
			} catch(Exception e){ //close메소드가 발생하는 예외처리
				// IOException과 NullPointerException처리하기 위한 
			}
		}
	}
}