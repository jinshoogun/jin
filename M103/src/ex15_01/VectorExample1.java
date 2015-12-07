package ex15_01;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//Vector 클래스 - List와 거의 비슷, 둘중에서 List를 더 많이 사용
// 1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
//   ex)int, double, char, boolean, String etc
// 2. 순서 있는 입,출력 처리(index 번호 순으로 저장됨)
// 3. 중복된 Data를 저장할 수 있다.
// 4. 입출력 방법이 다양하다. (열거형으로 출력가능)
// 5. 무조건 동기화를 하기 때문에 단일 스레드 처리에서는 ArrayList나 LinkedList에 비해 성능이 떨어진다.
//    (자바 1.2 이후 로느 거의 쓰이지 않음)
// 참고 )동기화란 스레드에서 공유자원에 작업을 마치기 전까지는 다른 스레이드에서 공유자원에 접근하지 못하게 약속하는 것

public class VectorExample1 {
	public static void main(String args[]) {
		Vector vec = new Vector();
		vec.add("Apple");
		vec.add("Banana");
		vec.add("Orange");

		String temp;
		for (int i = 0; i < vec.size(); i++) {
			// 다운캐스팅 (명시적 형변환) (String)생략하면 에러 발생 - temp가 String형
			// temp = vec.get(i);
			temp = (String) vec.get(i);
			System.out.println(vec.get(i));
			System.out.println(temp.toUpperCase());
		}

		// Vector에 적용
		Enumeration enu = vec.elements(); // Enumeration는 열거형으로 받을 수 있다. Enum의
											// 풀네임
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());

		}
		Iterator iterator = vec.iterator();
		while (iterator.hasNext()) {
			Object str = iterator.next();
			System.out.println(str);
		}
		// Iterator 객체를 이용하여 List에 있는 데이트를 순서대로 가져올 수 있다.
	}
}
