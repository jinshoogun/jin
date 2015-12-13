package ex13_06;
//equals 메소드 사용 예 - 똑같은 값을 갖는 두개의 객체 생성
import java.util.GregorianCalendar;

public class ObjectExample5 {
	public static void main(String args[]){
		GregorianCalendar obj1 = new GregorianCalendar(2007, 0, 1);
		GregorianCalendar obj2 = new GregorianCalendar(2007, 0, 1);
		
		if (obj1.equals(obj2))
			System.out.println("값이 같음");
		else
			System.out.println("값이 다름");
		
		if (obj1 == obj2)
			System.out.println("두 객체의 주소값이 같음.");
		else
			System.out.println("두 객체의 주소값이 다름");
	}
}
