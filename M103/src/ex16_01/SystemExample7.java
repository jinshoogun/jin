package ex16_01;
// 시스템 프로퍼티를 모두 가져와 출력하는 프로그램
import java.util.Properties;
public class SystemExample7 {
	public static void main(String args[]) {
		// 시스템 프로퍼티를 모두 가져옴
		Properties props = System.getProperties();
		// 가져온 시스템 프로퍼티를 출력함.
		props.list(System.out); //props 객체에 있는 모든 프로퍼티들을 System.out으로 출력합니다
	}

}
