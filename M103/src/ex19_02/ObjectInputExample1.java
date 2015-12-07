package ex19_02;
//GoodsStock 객체를 역직렬화하는 프로그램 
// 직렬화를 못함 - java.io.Serialable 인터페이스를 구현하지 않았기 때문입니다.
import java.io.*;

public class ObjectInputExample1  {
	public static void main(String args[]) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output2.dat"));
		
			while (true) {

				GoodsStock obj = (GoodsStock) in.readObject();
				System.out.println("상품 코드 : " + obj.code + "\t 상품 수량 : " + obj.num);
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");

		} catch (EOFException eofe) {// 파일로부터 더이상 읽을 객체가 없을때 발생하는 예외처리를 합니다.
			System.out.println("시마이.");

		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수가 없습니다.");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다..");
			
		} finally {
			try {
				in.close(); // 파일 종료

			} catch (Exception e) { // close메소드가 발생하는 예외처리
			}
		}
	}
}
