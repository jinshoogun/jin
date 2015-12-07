package ex15_01;

import java.util.ArrayList;
import java.util.List;

//List 인터페이스 - ArrayList(상속받는 클래스)
// 1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
// 2. 입력한 순서대로 출력이 된다.(index번호순으로 저장됨)
// 3. 중복된 Data를 저장할 수 있음
// 4. 배열의 장점과 배열에서 사용할 수 없는 것을 사용가능
// 5. 동적인 저장 구조를 이용할 수 있다.


public class ArrayListExample1 {
	public static void main(String args[]){
		List list = new ArrayList(); //업캐스팅 (상속해준 메소드만 사용가능)
		//ArrayList = new ArrayList();
		
		// 자료 추가 add
		list.add("하나");
		list.add(2);
		list.add(false);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add('A');
		
		System.out.println(list); //list의 모든 데이터 출력
		
		//size() : 데이터의 갯수 구하는 메소오오오드
		System.out.println("데이터의 갯수 = " + list.size());
		
		//get(index) : 해당 인덱스의 데이터 가져오는 메소드
		System.out.println("list.get(3) = " + list.get(3));
		                                      //0부터 시작, index = 3만 출력하라
	}
}
